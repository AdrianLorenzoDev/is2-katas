package kata2;

import java.util.Map;
import java.util.HashMap;

public class Histogram<T> {
    private Map<T, Integer> histogramMap;

    public Histogram(T[] data) {
        histogramMap = new HashMap<>();
        createHistogram(data);
    }

    public Map<T, Integer> getHistogramMap() {
        return histogramMap;
    }

    public void setHistogramMap(T[] data) {
        histogramMap = new HashMap<>();
        createHistogram(data);
    }

    private Map<T, Integer> createHistogram(T[] data) {

        for(T key : data) {
            histogramMap.put(key, histogramMap.containsKey(key) ? histogramMap.get(key) + 1 : 1);
        }

        return histogramMap;
    }

    @Override
    public String toString(){
        String str = "";

        for (T key : histogramMap.keySet()) {
            Integer value = histogramMap.get(key);
            str += "Key: " + key.toString() + " --> Value: " + value + "\n";
        }

        return str;
    }
}
