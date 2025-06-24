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
import model.Penjualan;
import model.Penjualan.DetailPenjualan;
import model.ViewDetailPenjualan;

public class PenjualanDAO {
    
    private static JDBC jdbc = JDBC.getInstance();
    private static Connection connection;
    private static Statement statement;
    private static CallableStatement callableStatement;
    
    public static Penjualan extractPenjualan(ResultSet resultSet) {
        try {
            return new Penjualan(
                resultSet.getString("nota"),
                resultSet.getInt("idPelanggan"),
                resultSet.getInt("idAdmin"),
            resultSet.getString("tanggal"));
        } catch (SQLException ex) {
            Logger.getLogger(ProdukDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public static ArrayList<Penjualan> getDataPenjualan() {
        ArrayList<Penjualan> listPenjualan = new ArrayList<>();
        
        try {
            Connection connection = JDBC.getInstance().getConnection();
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM Penjualan";
            ResultSet resultSet = statement.executeQuery(query);
            
            while (resultSet.next()) {
                Penjualan penjualan = extractPenjualan(resultSet);
                listPenjualan.add(penjualan);
            }
            resultSet.close();
            statement.close();
            connection.close();
            return listPenjualan;
        }
        catch (SQLException ex) {
            return null;
        }
    }
    
    public static Penjualan getDataPenjualanByID(String nota) {
        try {
            Connection connection = JDBC.getInstance().getConnection();
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM Penjualan WHERE nota = '" + nota + "'";
            ResultSet resultSet = statement.executeQuery(query);

            resultSet.next();
            Penjualan penjualan = extractPenjualan(resultSet);

            resultSet.close();
            statement.close();
            connection.close();
            return penjualan;
            }
        catch (SQLException ex) {
            return null;
        }
    }
   
    public static int addPenjualan(String nota, int idPelanggan, int idAdmin) {
        try {
            String query = "{CALL usp_add_penjualan(?, ?, ?, ?)}";
            connection = jdbc.getConnection();
            callableStatement = connection.prepareCall(query);
            callableStatement.setString(1, nota);
            callableStatement.setInt(2, idPelanggan);
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
    
    public static ArrayList<DetailPenjualan> getDataDetailPenjualan() {
        ArrayList<DetailPenjualan> listDetailPenjualan = new ArrayList<>();
        
        try {
            Connection connection = JDBC.getInstance().getConnection();
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM Detail_Penjualan";
            ResultSet resultSet = statement.executeQuery(query);
            
            while (resultSet.next()) {
                Penjualan penjualan = getDataPenjualanByID(resultSet.getString("nota"));
                DetailPenjualan detailPenjualan = penjualan.new DetailPenjualan(resultSet.getString("nota"), resultSet.getString("idProduk"), resultSet.getInt("harga"), resultSet.getInt("jumlah"));
                listDetailPenjualan.add(detailPenjualan);
            }
            resultSet.close();
            statement.close();
            connection.close();
            return listDetailPenjualan;
        }
        catch (SQLException ex) {
            return null;
        }
    }
    
    public static int addDetailPenjualan(String nota, String idProduk, int harga, int jumlah) {
        try {
            String query = "{CALL usp_add_detail_penjualan(?, ?, ?, ?, ?)}";
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
    
    public static ArrayList<ViewDetailPenjualan> viewDetailPenjualan(String nota) {
        ArrayList<ViewDetailPenjualan> listDetail = new ArrayList<>();
         
        try {
            Connection connection = JDBC.getInstance().getConnection();
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM view_subtotal_detail_penjualan WHERE nota = '" + nota + "'";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                ViewDetailPenjualan details = new ViewDetailPenjualan(resultSet.getString("nota"), resultSet.getString("idProduk"),
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
