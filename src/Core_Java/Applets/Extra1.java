// Message movement program at fix location using repaint and thread
package Core_Java.Applets;
import java.applet.*;
import java.awt.*;
 
 
@SuppressWarnings("removal")
public class Extra1  extends Applet implements Runnable{
        
    String msg = "Banner Motion";
    Thread t ;
    int state;
    boolean stopF;

    @Override
    public void init() {
        setBackground(Color.pink);
        setForeground(Color.pink);
        stopF = false;
    }

    @Override
    public void start() {
        t = new Thread(this);
        t.start();
    }


    @Override
    public void run(){
        char c;
        for(;;){
            try{
                repaint();
                Thread.sleep(500);
                c=msg.charAt(0);
                msg= msg.substring(1);
                msg+=c;
                if(stopF){
                    break;
                }
            } catch(InterruptedException e){

            }
        }
    }

    @Override
    public void stop() {
        //stopF = true;
        t = null;
    }

    public void paint(Graphics g){
        g.drawString(msg, 50, 20);
        showStatus("hello");
    }
}
  
/*
String msg = "Banner Motion";
Thread t = null;
<applet code = "Extra1" width = "400" height = "400"></applet>
*/