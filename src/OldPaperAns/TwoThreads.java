package OldPaperAns;

public class TwoThreads {
    public static void main(String[] args) {

        BCAT t1 = new BCAT();
        MCAT t2 = new MCAT();

        t1.start();
        t2.start();
    }
}

class BCAT extends Thread {
    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("BCA");
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        }
    }
}


class MCAT extends Thread {
    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("MCA");
                sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
