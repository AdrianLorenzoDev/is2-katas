package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {
    static Map<String, Integer> histogramMap;

    public static void main(String[] args) {
        Histogram hist = new Histogram(new String[]{"Rosa", "Pepe", "María", "Pepe", "Pepe", "Rosa"});
        System.out.println(hist.toString());
        
        hist.setHistogramMap(new Integer[]{7, 10, 10, 8, 8, 6, 8, 4, 5, 2, 10, 3, 4, 6, 8, 10, 1});
        System.out.println(hist.toString());
    }
}
