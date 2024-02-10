package Clg_Journal;

import java.applet.Applet;
import java.awt.*;


public class Q11 extends Applet{
        
    @Override
    public void init() {
        super.init();
        // setBackground(Color.black);
    }
    public void paint(Graphics g){
        
        // Outer Circle
        g.drawOval(50,50,300,300);
        g.setColor(Color.yellow);
        g.fillOval(51, 51, 299, 299);

        // First Eye
        g.setColor(Color.black);
        g.drawOval(110, 130, 75, 75);
        g.setColor(Color.white);
        g.fillOval(111, 131, 74, 74);

        // Second Eye
        g.setColor(Color.black);
        g.drawOval(220, 130, 75, 75);
        g.setColor(Color.white);
        g.fillOval(221, 131, 74, 74);

        // smile
        g.setColor(Color.black);
        g.drawArc(100, 150, 200, 150, 180, 180);
        g.setColor(Color.white);
        g.drawArc(100, 151, 200, 150, 180, 180);
        g.drawArc(100, 152, 200, 150, 180, 180);
        g.drawArc(100, 153, 200, 150, 180, 180);
        g.drawArc(100, 154, 200, 150, 180, 180);
        g.setColor(Color.black);
        g.drawArc(100, 155, 200, 150, 180, 180);

    }
}
  
/*
<applet code = "Smiley" width = "400" height = "400"></applet>
*/