package Clg_Journal;

import java.applet.Applet;
import java.awt.*;

public class Q10 extends Applet {
    private Color backgroundColor;

    public void init() {
        // Retrieve parameters passed to the applet
        String colorParam = getParameter("color");
        if (colorParam != null) {
            // Parse the color parameter and set the background color
            try {
                int colorValue = Integer.parseInt(colorParam, 16);
                backgroundColor = new Color(colorValue);
            } catch (NumberFormatException e) {
                System.err.println("Invalid color parameter: " + colorParam);
            }
        } else {
            backgroundColor = Color.WHITE; // Default background color
        }
    }

    public void paint(Graphics g) {
        // Set the background color
        setBackground(backgroundColor);
    }
}

/*
 <applet code="Q10" width="400" height="300">
        <param name="color" value="FF0000">
        <!-- Pass color parameter in hex format -->
    </applet>
 */