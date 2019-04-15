package kata5p2.view;

import kata5p2.model.Mail;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MailListReader {

    public static List<Mail> read(String fileName) throws IOException {
        List<Mail> mailList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("email.txt"))) {
            String line;
            while((line = reader.readLine()) != null){
                if (line.contains("@")){
                    mailList.add(new Mail(line));
                }
            }
            return mailList;
        }
    }

}
