import java.applet.*;
import java.awt.*;

public class CT extends Applet{

    public void paint(Graphics g){

        int[] x = {35,8,65};
        int y[] = {40,80,80};

        g.setColor(Color.magenta);
        g.fillOval(2,36,65,65);
        g.setColor(Color.green);
        g.fillPolygon(x,y,3);
    }

}

// <applet code="CT" width=400 height=200 ></applet>