package dao;

import model.*;
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

public class UserDAO {
    
    private static JDBC jdbc = JDBC.getInstance();
    private static Connection connection;
    private static Statement statement;
    private static CallableStatement callableStatement;
    
    public static User extract(ResultSet resultSet) {
        try {
            return new User(
                resultSet.getInt("id"),
                resultSet.getString("fullname"),
                resultSet.getString("username"),
                resultSet.getString("password"),
                resultSet.getInt("privilege"));
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public static ArrayList<User> getData() {
        ArrayList<User> listAccount = new ArrayList<>();
        
        try {
            Connection connection = JDBC.getInstance().getConnection();
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM Admin";
            ResultSet resultSet = statement.executeQuery(query);
            
            while (resultSet.next()) {
                User user = extract(resultSet);
                listAccount.add(user);
            }
            resultSet.close();
            statement.close();
            connection.close();
            return listAccount;
        }
        catch (SQLException ex) {
            return null;
        }
    }
     
    public static User getDataByID(int id) {
        try {
            Connection connection = JDBC.getInstance().getConnection();
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM Admin WHERE id = " + id;
            ResultSet resultSet = statement.executeQuery(query);

            resultSet.next();
            User user = extract(resultSet);

            resultSet.close();
            statement.close();
            connection.close();
            return user;
            }
        catch (SQLException ex) {
            return null;
        }
    }
     
    public static int login(String username, String password) {
        try {
            String query = "{CALL usp_login(?, ?, ?)}";
            connection = jdbc.getConnection();
            callableStatement = connection.prepareCall(query);
            callableStatement.setString(1, username);
            callableStatement.setString(2, password);
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
    
    public static int addAdmin(String fullname, String username, String password) {
        try {
            String query = "{CALL usp_add_admin(?, ?, ?, ?)}";
            connection = jdbc.getConnection();
            callableStatement = connection.prepareCall(query);
            callableStatement.setString(1, fullname);
            callableStatement.setString(2, username);
            callableStatement.setString(3, password);
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
    
    public static int changePassword(String username, String password) {
        try {
            String query = "{CALL usp_change_password(?, ?, ?)}";
            connection = jdbc.getConnection();
            callableStatement = connection.prepareCall(query);
            callableStatement.setString(1, username);
            callableStatement.setString(2, password);
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
