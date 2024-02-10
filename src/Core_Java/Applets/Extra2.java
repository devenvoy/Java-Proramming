// Movement of Object with Mesage toward Left hand side

import java.applet.*;
import java.awt.*;
 
 
public class Extra2  extends Applet implements Runnable{
       
    Thread t = null;
    boolean stopF;
    int width , height;
    int x, y;

    @Override
    public void init() {
        width = getSize().width;
        height = getSize().height;
        setBackground(Color.yellow);
        x = width/2-20;
        y = height/2-20;
        stopF = false;
    }  // init

    @Override
    public void start() {
        t = new Thread(this);
        t.start();
    } // start

    public void paint(Graphics g){
        setForeground(Color.red);
        g.drawRect(x, y,70,40);
        g.drawString("Devansh", x+5,y+25);
        showStatus("Hello");
    } // paint

    @Override
    public void run() {
        for(;;){
            try {
                Thread.sleep(250);
                repaint();
                x = x-1;
                if(stopF){
                    break;
                }
            } catch (InterruptedException e) {
            }
        } // try
    } // run

    @Override
    public void stop() {
        stopF = true;
        t = null;
    } /// stop 
}   // class
  
/*
<applet code = "Extra2" width = "300" height = "100"></applet>
*/