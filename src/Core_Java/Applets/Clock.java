package Core_Java.Applets;
import java.applet.*;
import java.awt.*;
import java.util.*;

/*
<applet code="C" WIDTH = "500" HEIGHT ="500"></applet>*/
@SuppressWarnings("removal")
public class Clock extends Applet implements Runnable {

	Thread t;

	public void start() {
		t = new Thread(this);
		t.start();
	}

	public void run() {
		// t1 = Thread.currentThread();
		while (true) {
			repaint();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}

	public void paint(Graphics g) {

		Calendar cal = new GregorianCalendar();

		String hour = String.valueOf(cal.get(Calendar.HOUR));
		String minute = String.valueOf(cal.get(Calendar.MINUTE));
		String second = String.valueOf(cal.get(Calendar.SECOND));
		g.drawString(hour + ":" + minute + ":" + second, 20, 30);

	}

}
