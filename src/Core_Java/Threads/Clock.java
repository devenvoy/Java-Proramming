package Core_Java.Threads;

public class Clock extends Thread {
    public static void main(String[] args) {
        int hh, mm, ss;
        try {
            // Thread t = new Thread("Clock");
            for (hh = 0; hh < 24; hh++) {
                for (mm = 0; mm < 60; mm++) {
                    for (ss = 0; ss < 60; ss++) {
                        System.out.println(hh + ":" + mm + ":" + ss);
                        sleep(1000);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }
}
