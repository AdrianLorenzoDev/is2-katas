package watch;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public static void main(String[] args) {
        new Main().launch();
    }

    public Main() throws HeadlessException {
        Watch watch = new Watch();
        WatchDisplay watchDisplay = new WatchDisplay();
        WatchPresenter watchPresenter = new WatchPresenter(watch, watchDisplay);
        this.frameInit();
        this.add(watchDisplay);
    }

    private void launch() {
        this.setTitle("Watch");
        this.setUndecorated(true);
        this.setSize(400,400);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setBackground(new Color(0,0,0,0));
        this.setVisible(true);
    }


}
