package watch;

import javax.swing.*;
import java.awt.*;

import static watch.WatchPresenter.toPoint;

public class WatchDisplay extends JPanel {
    private Point[] points = new Point[0];

    public void paint(Point[] points){
        this.points = points;
        repaint();
    }

    public void paint(Graphics g){
        int width = 1;
        drawBackground(g);
        drawClock((Graphics2D) g);
        Point originPoint = new Point(getWidth()/2, getHeight()/2);
        for (Point point : points) {
            paintLine((Graphics2D) g, width++, originPoint, point);
        }
    }

    private void drawBackground(Graphics g){
        setOpaque(false);
        g.setColor(new Color(0,0,0,0.4f));
        g.fillRect(0,0, getWidth(), getHeight());
    }

    private void drawClock(Graphics2D g) {
        g.setColor(Color.white);
        g.setStroke(new BasicStroke(3));
        g.drawOval(getWidth()/2-120, getHeight()/2-120,240,240 );
    }

    private void paintLine(Graphics2D g, int width, Point originPoint, Point endPoint) {
        g.setStroke(new BasicStroke(width));
        g.setColor(Color.white);
        g.drawLine(originPoint.x, originPoint.y,originPoint.x+endPoint.x,originPoint.y-endPoint.y);
    }
}
