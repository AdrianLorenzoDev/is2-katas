package kata4.view;

import kata4.model.Histogram;
import kata4.model.Mail;

import java.util.List;

public class MailHistogramBuilder {
    public static Histogram<String> build(List<Mail> list){
        Histogram<String> histogram = new Histogram<>();
        for(Mail mail : list){
            histogram.increment(mail.getDomain());
        }

        return histogram;
    }
}
