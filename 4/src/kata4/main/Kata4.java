package kata4.main;

import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;

import java.io.IOException;
import java.util.List;

public class Kata4 {
    private static String fileName;
    private List<Mail> mailList;
    private Histogram<String> histogram;
    private HistogramDisplay histoDisplay;

    public static void main(String[] args) throws IOException {
        fileName = "email.txt";
        Kata4 kata4 = new Kata4();
        kata4.execute();
    }

    private void execute() throws IOException {
        input();
        process();
        output();
    }

    private void input() throws IOException {
        mailList = MailListReader.read(fileName);
    }

    private void process(){
        histogram = MailHistogramBuilder.build(mailList);
    }

    private void output(){
        histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }

}
