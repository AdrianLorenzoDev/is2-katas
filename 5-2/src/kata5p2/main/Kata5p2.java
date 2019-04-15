package kata5p2.main;

import kata5p2.model.Histogram;
import kata5p2.model.Mail;
import kata5p2.view.HistogramDisplay;
import kata5p2.view.MailHistogramBuilder;
import kata5p2.view.MailListReaderDB;

import java.io.IOException;
import java.util.List;

public class Kata5p2 {
    private List<Mail> mailList;
    private Histogram<String> histogram;
    private HistogramDisplay histoDisplay;

    public static void main(String[] args) throws IOException {
        Kata5p2 kata5p2 = new Kata5p2();
        kata5p2.execute();
    }

    private void execute() throws IOException {
        input();
        process();
        output();
    }

    private void input() throws IOException {
        mailList = MailListReaderDB.read();
    }

    private void process(){
        histogram = MailHistogramBuilder.build(mailList);
    }

    private void output(){
        histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }

}
