package dao;

import model.*;
import Database.JDBC;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class KategoriDAO {
    
    private static JDBC jdbc = JDBC.getInstance();
    private static Connection connection;
    private static Statement statement;
    private static CallableStatement callableStatement;
    
    public static ArrayList<Kategori> getData() {
        ArrayList<Kategori> listKategori = new ArrayList<>();
        
        try {
            Connection connection = JDBC.getInstance().getConnection();
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM Kategori";
            ResultSet resultSet = statement.executeQuery(query);
            
            while (resultSet.next()) {
                Kategori kategori = new Kategori(resultSet.getString("id"), resultSet.getString("nama"));
                listKategori.add(kategori);
            }
            resultSet.close();
            statement.close();
            connection.close();
            return listKategori;
        }
        catch (SQLException ex) {
            return null;
        }
    }
}
