import java.applet.Applet;
import java.awt.*;

/*
<applet code="House" width="400" height="400"></applet>
 */

public class House extends Applet {

    public void paint(Graphics g)
    {
        g.setColor(Color.red);
        g.drawRect(50, 150, 200, 150);
        g.fillRect(50, 150, 200, 150);
        g.setColor(Color.blue);
        g.drawRect(50, 150, 400, 150);
        g.fillRect(250, 150, 200, 150);

        g.drawLine(350, 150, 175, 150);
        g.drawLine(150, 100, 350, 100);
        g.drawLine(350, 100, 450, 150);

        g.setColor(Color.green);
        g.fillRect(150, 75, 300, 75);

        g.setColor(Color.white);
        int[] p={450,450,370};
        int[] q={150,75,75};
        g.drawPolygon(p,q,3);
        g.fillPolygon(p,q,3);

        g.setColor(Color.black);
        int[] x = {50, 150, 250};
        int[] y = {150, 75, 150};
        g.drawPolygon(x, y, 3);
        g.fillPolygon(x,y,3);

        g.setColor(Color.black);
        g.drawRect(110, 250, 80, 50);
        g.fillRect(110, 250, 80, 50);

        g.setColor(Color.yellow);
        g.drawRect(190, 180, 40, 40);
        g.fillRect(190, 180, 40, 40);

    }
}


/*
 * 
 * 
 * 
 *  g.setColor(Color.red);
        g.fillRect(50, 150, 200, 150);
        g.setColor(Color.blue);
        g.fillRect(250, 150, 200, 150);

        //g.drawLine(350, 150, 175, 150);
        g.drawLine(150, 100, 350, 100);
        g.drawLine(350, 100, 450, 150);
        
        g.setColor(Color.green);
        g.fillRect(150, 75, 300, 75);

        g.setColor(Color.white);
        int[] p={450,450,370};
        int[] q={150,75,75};
        g.fillPolygon(p,q,3);

        g.setColor(Color.black);
        int[] x = {50, 150, 250};
        int[] y = {150, 75, 150};
        g.fillPolygon(x,y,3);

        g.fillRect(110, 250, 80, 50);


        g.setColor(Color.yellow);
        g.fillRect(190, 180, 40, 40);

 * 
 */
