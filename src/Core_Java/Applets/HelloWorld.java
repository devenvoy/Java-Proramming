
package Core_Java.Applets;
import java.applet.*;
import java.awt.*;

@SuppressWarnings("removal")
public class HelloWorld extends Applet {

    public void paint(Graphics g) {

        g.drawString("Hello World", 50, 50);

    }
}

/*
 * <applet code = "HelloWorld" width = "400" height = "400"></applet>
 */