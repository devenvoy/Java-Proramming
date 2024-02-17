package Core_Java.Threads;

public class Main {
    public static void main(String[] args) throws InterruptedException {
/*
    Thread - A thread of execution in a program (kind of like a virtual cpu)
    the jvm allows an application to have multiple threads running concurrently
    Each thread can execute parts of your code in parallel with main thread
    Each thread has a priority

    priority
            The Java Virtual Machine continues to execute threads until either of the following occurs
    					1. The exit method of class Runtime has been called
    					2. All user threads have died

    				When a JVM starts up, there is a thread which calls the main method
    				This thread is called “main"

    Daemon thread is a low priority thread that runs in background to perform tasks such as garbage collection
    JVM terminates itself when all user threads (non-daemon threads) finish their execution
*/

        // Currently Active Thread Count
        System.out.println(Thread.activeCount());
        // Get current thread name
        System.out.println(Thread.currentThread().getName());
        // Change / set the current thread name
        Thread.currentThread().setName("MAIN");
        System.out.println(Thread.currentThread().getName());
        // get current thread priority
        // Higher number  = higher priority
        System.out.println(Thread.currentThread().getPriority());
        // Mostly Defined in Constant like
//        Thread.MAX_PRIORITY   - > 10
//        Thread.NORM_PRIORITY  - > 5
//        Thread.MIN_PRIORITY   - > 1
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        // Check thread is alive or not
        System.out.println(Thread.currentThread().isAlive());


        for(int i =3;i>0;i--) {
            System.out.println(i);
            // Pause thread for given millisecond
            Thread.sleep(1000);
        }
        System.out.println("You are done!");

        MyThread thread2 = new MyThread();

        thread2.setDaemon(true);
        System.out.println(thread2.isDaemon());

        // execute override run method in new thread
        thread2.start();

        System.out.println(thread2.isAlive());
        // change the name of thread
        thread2.setName("2nd thread");
        System.out.println(thread2.getName());

        thread2.setPriority(Thread.MIN_PRIORITY);

        System.out.println(thread2.getPriority());

        System.out.println(Thread.activeCount());


    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        if (this.isDaemon()) {
            System.out.println("This is a daemon thread is running");
        } else {
            System.out.println("This is user thread that is running");
        }
    }
}
