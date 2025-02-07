package Core_Java.Applets;

import java.applet.*;
import java.awt.*;

@SuppressWarnings("removal")
public class paramDemo extends Applet {

    String fname;
    int fsize;
    float lead;
    boolean active;
    int a, b, c;

    public void start() {

        String param;

        fname = getParameter("fname");
        if (fname == null) {
            fname = "Not Found";
        }

        param = getParameter("fsize");
        try {
            if (param != null) {
                fsize = Integer.parseInt(param);
            } else {
                fsize = 0;
            }
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }

        param = getParameter("lead");
        try {
            if (param != null) {
                lead = Float.parseFloat(param);
            } else {
                lead = 0.0F;
            }
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }

        param = getParameter("accountEnabled");
        if (param != null) {
            active = Boolean.valueOf(param).booleanValue();
        }

        a = 10;
        b = 20;
        c = a + b;
    } // Start

    public void paint(Graphics g) {

        g.drawString("Font Name :" + fname, 0, 10);
        g.drawString("Font Size : " + fsize, 0, 26);
        g.drawString("Leading : " + lead, 0, 42);
        g.drawString("Account Active : " + active, 0, 58);
        g.drawString("c : " + c, 0, 70);

    }
}

/*
 * <applet code = "paramDemo" width = "300" height = "100">
 * <param name = fname value = Times New Roman>
 * <param name = fsize value = 14 >
 * <param name = lead value = 2 >
 * <param name = accountEnabled value = true >
 * </applet>
 */