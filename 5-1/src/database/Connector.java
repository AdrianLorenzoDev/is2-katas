package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
    public static Connection connect(String url){
        Connection connection = null;
        try{
            connection = DriverManager.getConnection(url);
            System.out.println("Connection established");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }

    public static void disconnect(Connection connection){
        try {
            if (connection != null) {
                connection.close();
                System.out.println("Connection ended");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
