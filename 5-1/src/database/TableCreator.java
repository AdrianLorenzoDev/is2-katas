package database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TableCreator {
    public static void createNewTable(Connection connection) {

        String query = "CREATE TABLE IF NOT EXISTS EMAIL (\n" + " Id integer PRIMARY KEY AUTOINCREMENT,\n"
                + " Mail text NOT NULL);";

        try (Statement stmt = connection.createStatement()) {
            stmt.execute(query);
            System.out.println("Table created");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
