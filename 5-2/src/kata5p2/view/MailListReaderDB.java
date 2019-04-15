package kata5p2.view;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import kata5p2.model.Mail;

public class MailListReaderDB {

    public static List<Mail> read() {
        List<Mail> mailList = new ArrayList<>();
        String sql = "SELECT Mail FROM EMAIL";

        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:Kata5.db");
             Statement statement = connection.createStatement();
             ResultSet result = statement.executeQuery(sql)){
            while (result.next()) {
                mailList.add(new Mail(result.getString("Mail")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return mailList;
    }
}
