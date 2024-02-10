import java.applet.*;
import java.awt.*;
 
 
public class Example2  extends Applet{
        
    int x = 10;
    int y = 50;
    Font fobj = new Font("Times New Roman",Font.BOLD,15);

    public void paint(Graphics g){
        
        g.setFont(fobj);

        g.drawLine(10, 30, 200, 30);
        g.drawString("Line",100,20);

        g.drawOval(x, y, 100, 100);
        g.setColor(Color.cyan);
        g.fillOval(x+2, y+2, 98 , 98);
        g.setColor(Color.black);
        g.drawString("Circle", 35, 100);

        g.drawRect(x, 180, 120, 100);
        g.setColor(Color.red);
        g.fillRect(x+1, 181, 119, 99);
        g.setColor(Color.black);
        g.drawString("Rectangle", x+20, 230);

        g.drawRoundRect(200, 200, 180, 100, 50, 50);
        g.setColor(Color.blue);
        g.fillRoundRect(200, 200, 180, 100,  50, 50);
        g.setColor(Color.green);
        g.drawString("Round Rectangle", 220, 250);

    }
}
  
/*
<applet code = "Example2" width = "400" height = "400"></applet>
*/