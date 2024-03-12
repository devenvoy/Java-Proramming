import java.awt.*;
import java.applet.*;

public class nrbox extends Applet{

    public void paint(Graphics g){

        int n = Integer.parseInt(getParameter("n"));

        for(int i = 0;i<n;i++){
            g.setColor(Color.blue);
            g.fillRect(i*100,i*100,100,100);
        }
    }

}

/*
<applet code="nrbox" width=500 height=500 >
<param name=n value=5></param> 
</applet>
*/