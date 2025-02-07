package Core_Java.Applets;

import java.applet.*;
import java.awt.*;

@SuppressWarnings("removal")
public class Face extends Applet {

    public void paint(Graphics g) {

        // Head
        g.drawOval(40, 40, 120, 150);
        // Left Eye
        g.drawOval(57, 75, 30, 20);
        // Right Eye
        g.drawOval(110, 75, 30, 20);
        // Pupil Left
        g.fillOval(68, 81, 10, 10);
        // Pupil Right
        g.fillOval(121, 81, 10, 10);

        // Nose
        g.drawOval(85, 100, 30, 30);

        // Mouth
        g.drawArc(60, 125, 80, 40, 180, 180);

        // Left Ear
        g.drawOval(25, 92, 15, 30);

        // Right Ear
        g.drawOval(160, 92, 15, 30);

    }
}

/*
 * <applet code = "Face" width = "400" height = "400"></applet>
 */