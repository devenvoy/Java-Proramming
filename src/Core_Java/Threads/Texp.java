package Core_Java.Threads;

class Thread1 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 10000) {
            System.out.println("Hola, from Thread1");
            i++;
        }
    }
}

class Thread2 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 10000) {
            System.out.println("Hello, From Thread2");
            i++;
        }
    }
}

public class Texp {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();
        t2.start();
    }
}
