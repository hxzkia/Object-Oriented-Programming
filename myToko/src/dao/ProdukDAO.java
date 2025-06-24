package dao;

import Database.JDBC;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Types;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Produk;

public class ProdukDAO {
    
    private static JDBC jdbc = JDBC.getInstance();
    private static Connection connection;
    private static Statement statement;
    private static CallableStatement callableStatement;
    
    public static Produk extract(ResultSet resultSet) {
        try {
            return new Produk(
                resultSet.getString("id"),
                resultSet.getString("nama"),
                resultSet.getString("kategori"),
                resultSet.getInt("stok"),
                resultSet.getInt("harga"));
        } catch (SQLException ex) {
            Logger.getLogger(ProdukDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public static ArrayList<Produk> getData() {
        ArrayList<Produk> listProduk = new ArrayList<>();
        
        try {
            Connection connection = JDBC.getInstance().getConnection();
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM Produk";
            ResultSet resultSet = statement.executeQuery(query);
            
            while (resultSet.next()) {
                Produk produk = extract(resultSet);
                listProduk.add(produk);
            }
            resultSet.close();
            statement.close();
            connection.close();
            return listProduk;
        }
        catch (SQLException ex) {
            return null;
        }
    }
    
    public static Produk getDataByID(String id) {
        try {
            Connection connection = JDBC.getInstance().getConnection();
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM Produk WHERE id = " + id;
            ResultSet resultSet = statement.executeQuery(query);

            resultSet.next();
            Produk produk = extract(resultSet);

            resultSet.close();
            statement.close();
            connection.close();
            return produk;
            }
        catch (SQLException ex) {
            return null;
        }
    }
    
    public static int addProduk(String id, String nama, String kategori, int stok, int harga) {
        try {
            String query = "{CALL usp_add_produk(?, ?, ?, ?, ?, ?)}";
            connection = jdbc.getConnection();
            callableStatement = connection.prepareCall(query);
            callableStatement.setString(1, id);
            callableStatement.setString(2, nama);
            callableStatement.setString(3, kategori);
            callableStatement.setInt(4, stok);
            callableStatement.setInt(5, harga);
            callableStatement.registerOutParameter(6, Types.INTEGER);
            
            callableStatement.executeUpdate();
            int result = callableStatement.getInt(6);
            
            callableStatement.close();
            connection.close();
            return result;
        } 
        catch (SQLException ex) {
            return 0;
        }
    }
    
    public static int changeHarga(String id, int harga) {
        try {
            String query = "{CALL usp_change_harga(?, ?, ?)}";
            connection = jdbc.getConnection();
            callableStatement = connection.prepareCall(query);
            callableStatement.setString(1, id);
            callableStatement.setInt(2, harga);
            callableStatement.registerOutParameter(3, Types.INTEGER);
            
            callableStatement.executeUpdate();
            int result = callableStatement.getInt(3);
            
            callableStatement.close();
            connection.close();
            return result;
        } 
        catch (SQLException ex) {
            return 0;
        }
    }
}
