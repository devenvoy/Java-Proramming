import java.applet.*;
import java.awt.*;
 

public class Squares  extends Applet{

    int squares;
    boolean flag = true;
    int x , y;
    int count = 0;

    @Override
    public void init() {
        super.init();

        x = 30;
        y = 30;

        String param = getParameter("qty");
        if(param != null){
            squares = Integer.parseInt(param);
        }  else{
            squares = 0;
        }
    }
        
    public void paint(Graphics g){
        
        if(squares <= 0){
            g.setColor(Color.red);
            g.drawString("Null OR Zero Squares", 100, 100);
            return;
        }
        while (squares > 0) {
            if(flag){
                g.drawRect(x, y, 50, 50);
                x += 80;
                flag = false;
                count++;
            } else{
                g.drawRect(x,y,50,50);
                y += 80;
                x -= 80;
                flag = true;
                count++;
            }
            if(count >= 10){
                count %= 10;
                x += 160;
                y = 30;
            }
            squares--;
        }

    }
}
  
/*
<applet code = "Squares" width = "400" height = "500">
<param name=qty value=15>
</applet>
*/