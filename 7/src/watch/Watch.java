package watch;


import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class Watch {
    public final double SecondsStep = Math.PI*2 / 60;
    private final double MinutesStep = SecondsStep / 60;
    private final double HoursStep = MinutesStep / 12;

    private double seconds = Math.PI / 2;
    private double minutes = Math.PI / 2;
    private double hours = Math.PI / 2;

    private final List<Observer> observers = new ArrayList<>();

    public Watch(){
        Timer timer = new Timer();
        timer.schedule(TimerTask(), 0, 1000);
    }

    public double getSeconds() {
        return seconds;
    }

    public double getMinutes() {
        return minutes;
    }

    public double getHours() {
        return hours;
    }

    private TimerTask TimerTask() {
        return new TimerTask() {
            @Override
            public void run() {
                step();
                updateObservers();
            }
        };
    }

    private void step() {
        seconds = normalize(seconds - SecondsStep);
        minutes = normalize(minutes - MinutesStep);
        hours = normalize(hours - HoursStep);
    }

    private double normalize(double angle){
        return (angle + Math.PI * 2) % (Math.PI* 2);
    }

    public void updateObservers(){
        for (Observer observers : observers) {
            observers.update();
        }
    }

    public void add(Observer observer) {
        observers.add(observer);
    }

    public interface Observer{
        public void update();
    }
}
