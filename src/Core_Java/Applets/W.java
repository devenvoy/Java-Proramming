package Core_Java.Applets;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("removal")
public class W extends Applet implements ActionListener, Runnable {
    private int angle = 0; // current angle of rotation
    private boolean rotating = false; // flag to control rotation
    private Button startButton, stopButton;

    public void init() {
        // Set layout
        setLayout(new BorderLayout());

        // Create buttons
        startButton = new Button("Start");
        stopButton = new Button("Stop");

        // Add action listeners to buttons
        startButton.addActionListener(this);
        stopButton.addActionListener(this);

        // Add buttons to the applet
        add(startButton, BorderLayout.WEST);
        add(stopButton, BorderLayout.EAST);
    }

    public void start() {
        // Start the animation thread
        Thread t = new Thread(this);
        t.start();
    }

    public void stop() {
        // Stop the animation thread
        rotating = false;
    }

    public void paint(Graphics g) {
        // Clear the background
        super.paint(g);
        // Set the rotation point at the center of the applet
        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;
        g.setColor(Color.BLACK);
        // Draw the wheel (circle)
        g.drawOval(centerX - 50, centerY - 50, 100, 100);
        // Calculate the coordinates of the end point of the line (radius = 50)
        int x = (int) (centerX + 50 * Math.cos(Math.toRadians(angle)));
        int y = (int) (centerY + 50 * Math.sin(Math.toRadians(angle)));
        // Draw the line (spoke)
        g.drawLine(centerX, centerY, x, y);
    }

    public void actionPerformed(ActionEvent e) {
        // Handle button clicks
        if (e.getSource() == startButton) {
            rotating = true;
        } else if (e.getSource() == stopButton) {
            rotating = false;
        }
    }

    public void run() {
        // Animation loop
        while (true) {
            if (rotating) {
                // Increment the angle
                angle++;
                // Repaint the applet to reflect the change in angle
                repaint();
            }
            // Pause for a short while to control the speed of rotation
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

/*
 * <applet code="W" width =400 height=200></applet>
 */