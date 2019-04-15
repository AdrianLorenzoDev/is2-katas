package database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class SelectApp {
    public static void selectAll(Connection connection, String table){
        String sql = "SELECT * FROM " + table;

        try (Statement statement = connection.createStatement();
             ResultSet result = statement.executeQuery(sql)){
            while (result.next()) {
                System.out.println(result.getInt("id") + "\t" + result.getString("Name") + "\t" +
                result.getString("Apellidos") + "\t" + result.getString("Departamento") + "\t");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
