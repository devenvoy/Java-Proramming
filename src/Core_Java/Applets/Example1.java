package Core_Java.Applets;
import java.applet.*;
import java.awt.*;

@SuppressWarnings("removal")
public class Example1 extends Applet {

    int x = 300;
    int y = 100;
    int r = 50;

    public void paint(Graphics g) {

        g.setColor(Color.red);
        g.drawLine(3, 300, 200, 10); // draw Line
        g.setColor(Color.magenta);
        g.drawString("Line", 100, 100);

        g.drawOval(x - r, y - r, 100, 100); // draw Oval/Circle
        g.setColor(Color.yellow);
        g.fillOval(x - r, y - r, 100, 100); // fill color inside oval
        g.setColor(Color.magenta);
        g.drawString("Circle", 275, 100);

        g.drawRect(400, 50, 200, 100); // draw Rectangle
        g.setColor(Color.yellow);
        g.fillRect(400, 50, 200, 100); // Fill color inside rectangle
        g.setColor(Color.magenta);
        g.drawString("Rectangle", 450, 100);

    }
}

/*
 * <applet code = "Example1" width = "400" height = "400"></applet>
 */