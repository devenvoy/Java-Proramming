package Core_Java.Applets;

import java.applet.*;
import java.awt.*;

@SuppressWarnings("removal")
public class SC extends Applet {

    public void paint(Graphics g) {

        g.setColor(Color.green);
        g.fillOval(10, 1, 99, 99);
        g.setColor(Color.pink);
        g.fillRect(25, 15, 68, 68);

    }

}

/* <applet code="SC" width=400 height=100></applet> */
