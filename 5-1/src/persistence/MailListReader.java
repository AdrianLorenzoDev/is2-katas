package persistence;



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MailListReader {

    public static List<String> read(String fileName) throws IOException {
        List<String> mailList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while((line = reader.readLine()) != null){
                if (line.contains("@")){
                    mailList.add(line);
                }
            }
            return mailList;
        }
    }

}
