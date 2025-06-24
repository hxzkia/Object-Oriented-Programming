package dao;

import Database.JDBC;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;

import model.Pemasok;

public class PemasokDAO {
    private static JDBC jdbc = JDBC.getInstance();
    private static Connection connection;
    private static Statement statement;
    private static CallableStatement callableStatement;
    
    public static ArrayList<Pemasok> getData() {
        ArrayList<Pemasok> listPemasok = new ArrayList<>();
        
        try {
            Connection connection = JDBC.getInstance().getConnection();
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM Pemasok";
            ResultSet resultSet = statement.executeQuery(query);
            
            while (resultSet.next()) {
                Pemasok pemasok = new Pemasok(resultSet.getString("id"), resultSet.getString("nama"), resultSet.getString("nomorHP"));
                listPemasok.add(pemasok);
            }
            resultSet.close();
            statement.close();
            connection.close();
            return listPemasok;
        }
        catch (SQLException ex) {
            return null;
        }
    }
    
    public static int addPemasok(String id, String nama, String nomorHP) {
        try {
            String query = "{CALL usp_add_pemasok(?, ?, ?, ?)}";
            connection = jdbc.getConnection();
            callableStatement = connection.prepareCall(query);
            callableStatement.setString(1, id);
            callableStatement.setString(2, nama);
            callableStatement.setString(3, nomorHP);
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
}
