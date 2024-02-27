package Clg_Journal;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

// Triangle in circle
public class Q16 extends Applet {

    public void paint(Graphics g) {
        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;
        int circleRadius = 150; // Radius of the circle
        int triangleRadius = (int) (circleRadius / Math.sqrt(3)); // Radius of the triangle

        // Draw the circle
        g.setColor(Color.BLACK);
        g.drawOval(centerX - circleRadius, centerY - circleRadius, 2 * circleRadius, 2 * circleRadius);

        // Calculate coordinates of vertices of the equilateral triangle
        int[] vertexX = {
                centerX,
                centerX - triangleRadius,
                centerX + triangleRadius
        };
        int[] vertexY = {
                centerY - circleRadius,
                centerY + (int) (triangleRadius * Math.sqrt(3) / 2),
                centerY + (int) (triangleRadius * Math.sqrt(3) / 2)
        };

        // Draw and fill the triangle
        Color[] colors = {Color.RED, Color.GREEN, Color.BLUE}; // Different colors for the triangle
        g.setColor(Color.BLACK);
        g.fillPolygon(vertexX, vertexY, 3); // Fill the triangle with black color to represent the border
        for (int i = 0; i < 3; i++) {
            g.setColor(colors[i]);
            g.fillOval(vertexX[i] - 10, vertexY[i] - 10, 20, 20); // Draw a small circle at each vertex
        }
    }
}
