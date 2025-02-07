package Core_Java.Applets;
import java.applet.*;
import java.awt.*;

@SuppressWarnings("removal")
public class Demo extends Applet {

    @Override
    public void init() {

    }

    @Override
    public void start() {

    }

    @Override
    public void destroy() {

    }

    @Override
    public void stop() {

    }

    public void paint(Graphics g) {

        g.setColor(Color.yellow);
        g.fillOval(80, 70, 150, 150);

        g.setColor(Color.black);
        g.fillOval(120, 120, 15, 15);
        g.fillOval(170, 120, 15, 15);

        g.drawArc(120, 150, 70, 40, 180, 180);

    }
}

/*
 * <applet code = "Demo" width = "800" height = "600"></applet>
 */