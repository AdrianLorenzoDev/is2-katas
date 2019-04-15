package watch;

import java.awt.*;

public class WatchPresenter implements Watch.Observer {
    private Watch watch;
    private WatchDisplay watchDisplay;


    public WatchPresenter(Watch watch, WatchDisplay watchDisplay) {
        this.watch = watch;
        this.watchDisplay = watchDisplay;
        watch.add(this);
    }

    @Override
    public void update() {
        watchDisplay.paint(toPoints());
    }

    private Point[] toPoints() {
        return new Point[]{toPoint(watch.getSeconds(), 120),toPoint(watch.getMinutes(), 100),
                toPoint(watch.getHours(), 85)};
    }

    public static Point toPoint(double time, int length) {
      return new Point(toInt(length*Math.cos(time)), toInt(length*Math.sin(time)));
    }

    private static int toInt(double n) {
        return (int) n;
    }
}
