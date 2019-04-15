package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class InsertApp {
    public static void insertList(Connection connection, String table, String column, List<String> list){

        String sql = "INSERT INTO "+ table + "(" + column + ") VALUES(?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            for(int i = 0; i <list.size(); i++){
                statement.setString(1, list.get(i));
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

