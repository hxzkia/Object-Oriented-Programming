package dao;

import Database.JDBC;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;

import model.Pelanggan;

public class PelangganDAO {
    private static JDBC jdbc = JDBC.getInstance();
    private static Connection connection;
    private static Statement statement;
    private static CallableStatement callableStatement;
    
    public static ArrayList<Pelanggan> getData() {
        ArrayList<Pelanggan> listPelanggan = new ArrayList<>();
        
        try {
            Connection connection = JDBC.getInstance().getConnection();
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM Pelanggan";
            ResultSet resultSet = statement.executeQuery(query);
            
            while (resultSet.next()) {
                Pelanggan pelanggan = new Pelanggan(resultSet.getInt("id"), resultSet.getString("nama"), resultSet.getString("nomorHP"));
                listPelanggan.add(pelanggan);
            }
            resultSet.close();
            statement.close();
            connection.close();
            return listPelanggan;
        }
        catch (SQLException ex) {
            return null;
        }
    }
    
    public static int addPelanggan(String nama, String nomorHP) {
        try {
            String query = "{CALL usp_add_pelanggan(?, ?, ?)}";
            connection = jdbc.getConnection();
            callableStatement = connection.prepareCall(query);
            callableStatement.setString(1, nama);
            callableStatement.setString(2, nomorHP);
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
