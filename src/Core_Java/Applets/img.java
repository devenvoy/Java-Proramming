import java.awt.*;
import java.applet.*;

public class img extends Applet{

    public void paint(Graphics g){

        Image pic =getImage(getDocumentBase(),"123.png");
        g.drawImage(pic,50,50,this);

    }
}

/*<applet code="img" width=400 height=400></applet> */