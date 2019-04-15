import database.Connector;
import database.InsertApp;
import database.SelectApp;
import database.TableCreator;
import persistence.MailListReader;

import java.io.IOException;
import java.sql.Connection;

public class Main {
    public static void main(String[] args) {

        Connection connection = Connector.connect("jdbc:sqlite:Kata5.db");
        try {
            InsertApp.insertList(connection, "EMAIL", "Mail", MailListReader.read("email.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Connector.disconnect(connection);

    }
}
