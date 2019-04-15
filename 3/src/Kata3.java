public class Kata3 {
    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<>();

        for (int i = 0; i < 37 ; i++) {
            histogram.increment("hotmail.com");
            histogram.increment("mail.com");
            histogram.increment("gmail.com");
        }
        for (int i = 0; i < 48 ; i++) {
            histogram.increment("mail.com");
            histogram.increment("gmail.com");
        }
        for(int i = 0; i < 9; i++){
            histogram.increment("gmail.com");
        }

        HistogramDisplay histogramDisplay = new HistogramDisplay(histogram);
        histogramDisplay.execute();
    }

}
