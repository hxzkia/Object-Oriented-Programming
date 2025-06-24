package dao;

import Database.JDBC;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Pembelian;
import model.Pembelian.DetailPembelian;
import model.ViewDetailPembelian;

public class PembelianDAO {
    
    private static JDBC jdbc = JDBC.getInstance();
    private static Connection connection;
    private static Statement statement;
    private static CallableStatement callableStatement;
    
    public static Pembelian extractPembelian(ResultSet resultSet) {
        try {
            return new Pembelian(
                resultSet.getString("nota"),
                resultSet.getString("idPemasok"),
                resultSet.getInt("idAdmin"),
            resultSet.getString("tanggal"));
        } catch (SQLException ex) {
            Logger.getLogger(ProdukDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public static ArrayList<Pembelian> getDataPembelian() {
        ArrayList<Pembelian> listPembelian = new ArrayList<>();
        
        try {
            Connection connection = JDBC.getInstance().getConnection();
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM Pembelian";
            ResultSet resultSet = statement.executeQuery(query);
            
            while (resultSet.next()) {
                Pembelian pembelian = extractPembelian(resultSet);
                listPembelian.add(pembelian);
            }
            resultSet.close();
            statement.close();
            connection.close();
            return listPembelian;
        }
        catch (SQLException ex) {
            return null;
        }
    }
    
    public static Pembelian getDataPembelianByID(String nota) {
        try {
            Connection connection = JDBC.getInstance().getConnection();
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM Pembelian WHERE nota = '" + nota + "'";
            ResultSet resultSet = statement.executeQuery(query);

            resultSet.next();
            Pembelian pembelian = extractPembelian(resultSet);

            resultSet.close();
            statement.close();
            connection.close();
            return pembelian;
            }
        catch (SQLException ex) {
            return null;
        }
    }
   
    public static int addPembelian(String nota, String idPemasok, int idAdmin) {
        try {
            String query = "{CALL usp_add_pembelian(?, ?, ?, ?)}";
            connection = jdbc.getConnection();
            callableStatement = connection.prepareCall(query);
            callableStatement.setString(1, nota);
            callableStatement.setString(2, idPemasok);
            callableStatement.setInt(3, idAdmin);
            callableStatement.registerOutParameter(4, Types.INTEGER);
            
            callableStatement.executeUpdate();
            int result = callableStatement.getInt(4);
            
            callableStatement.close();
            connection.close();
            return result;
        } 
        catch (SQLException ex) {
            return 0;
        }
    }
    
    public static ArrayList<DetailPembelian> getDataDetailPembelian() {
        ArrayList<DetailPembelian> listDetailPembelian = new ArrayList<>();
        
        try {
            Connection connection = JDBC.getInstance().getConnection();
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM Detail_Pembelian";
            ResultSet resultSet = statement.executeQuery(query);
            
            while (resultSet.next()) {
                Pembelian pembelian = getDataPembelianByID(resultSet.getString("nota"));
                DetailPembelian detailPembelian = pembelian.new DetailPembelian(resultSet.getString("nota"), resultSet.getString("idProduk"), resultSet.getInt("harga"), resultSet.getInt("jumlah"));
                listDetailPembelian.add(detailPembelian);
            }
            resultSet.close();
            statement.close();
            connection.close();
            return listDetailPembelian;
        }
        catch (SQLException ex) {
            return null;
        }
    }
    
    public static int addDetailPembelian(String nota, String idProduk, int harga, int jumlah) {
        try {
            String query = "{CALL usp_add_detail_pembelian(?, ?, ?, ?, ?)}";
            connection = jdbc.getConnection();
            callableStatement = connection.prepareCall(query);
            callableStatement.setString(1, nota);
            callableStatement.setInt(2, harga);
            callableStatement.setInt(3, jumlah);
            callableStatement.setString(4, idProduk);
            callableStatement.registerOutParameter(5, Types.INTEGER);
            
            callableStatement.executeUpdate();
            int result = callableStatement.getInt(5);
            
            callableStatement.close();
            connection.close();
            return result;
        } 
        catch (SQLException ex) {
            return 0;
        }
    }
    
    public static ArrayList<ViewDetailPembelian> viewDetailPembelian(String nota) {
        ArrayList<ViewDetailPembelian> listDetail = new ArrayList<>();
         
        try {
            Connection connection = JDBC.getInstance().getConnection();
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM view_subtotal_detail_pembelian WHERE nota = '" + nota + "'";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                ViewDetailPembelian details = new ViewDetailPembelian(resultSet.getString("nota"), resultSet.getString("idProduk"),
                resultSet.getInt("jumlah"), resultSet.getInt("harga"), resultSet.getInt("subtotal"));
                listDetail.add(details);
            }
            resultSet.close();
            statement.close();
            connection.close();
            return listDetail;
        }
        catch (SQLException ex) {
            return null;
        }
    }
}
