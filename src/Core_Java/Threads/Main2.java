package Core_Java.Threads;

public class Main2 {
    public static void main(String[] args) {

        // Create a subclass of Thread
        MyThread2 thread1 = new MyThread2();
        //or
        //implement Runnable interface and pass instance as an argument to Thread()
        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1);

        //thread1.setDaemon(true);
        //thread2.setDaemon(true);
        thread1.start();
        // calling thread (ex.main) waits until the specified thread dies or for x milliseconds
        //thread1.join();
        // thread1.join(2000);
        thread2.start();

        // Thread Can run independently
        // mean even if One thread die other thread continues execution
        // Main thread stop bcs of exception
        System.out.println(1/0);

    }
}

class MyThread2 extends Thread {

    @Override
    public void run() {

        for (int i = 10; i > 0; i--) {
            System.out.println("Thread #1 : " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread #1 is finished :)");
    }

}

class MyRunnable implements Runnable {

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println("Thread #2 : " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread #2 is finished :)");
    }
}