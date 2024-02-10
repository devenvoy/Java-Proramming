import java.applet.*;
import java.awt.*;
 
 
public class LifeCycle  extends Applet{

    int count = 0;
        
    public void init(){
        System.out.println("init Method " + count++);
    }

    public void start(){
        System.out.println("Start Method "+ count++);
    }

    public void paint(Graphics g){
        System.out.println("paint Method "+ count++);
        g.drawString("paint Method "+count++, 50, 50);
    }

    public void stop(){
        System.out.println("stop Method "+count++);
    }

    public void destroy(){
        System.out.println("destroy Method "+ count++);
    }
}
  
/*
<applet code = "LifeCycle" width = "400" height = "400"></applet>
*/