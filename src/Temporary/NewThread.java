package Temporary;

public class NewThread implements Runnable{

    String name;
    Thread thread;

    NewThread(String name){
        this.name = name;
//        thread = new Thread(this,name);
        System.out.println(name+ " thread is created");
//        thread.start();
    }

    @Override
    public void run(){

        try{
            for(int i = 0; i< 5;i++){
                System.out.println(name+" : "+i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println(name + "Interrupted ");
        }
        System.out.println(name +"Thread Existing");
    }


    public static void main(String[] args) {
        NewThread t1 = new NewThread("1st");
        Thread t2 = new Thread(t1);
        t2.start();
//        try {
//            t2.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        new NewThread("2nd");
//        new NewThread("3rd");

        try{
            System.out.println("Start Waiting");
            Thread.sleep(8000);
        }catch(InterruptedException e){
            System.out.println("main thread Interrupted");
        }

        System.out.println("Exiting From main Thread");
    }
}
