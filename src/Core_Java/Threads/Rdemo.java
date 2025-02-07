package Core_Java.Threads;

public class Rdemo {
    public static void main(String[] args) {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main Thread " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main Interrupted");
        }
        System.out.println("Exit from the main");
    }
}

class demo implements Runnable {

    demo() {
        Thread t = new Thread(this, "demo thread");
        System.out.println("Child thread" + t);
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child Thread " + i);
                Thread.sleep(500);
            }
        } catch (Exception e) {
            System.out.println("Child Interrupted");
        }
        System.out.println("Exit from the child");
    }
}
