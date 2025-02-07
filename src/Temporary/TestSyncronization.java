package Temporary;

class Table {
    synchronized void printTable(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class MyThread1 extends Thread {
    Table t;
    int n;
    MyThread1(Table t, int n) {
        this.t = t;
        this.n = n;
    }
    public void run() {
        t.printTable(n);
    }
}

public class TestSyncronization {
    public static void main(String[] args) {
        Table obj = new Table();
        MyThread1 t1 = new MyThread1(obj, 5);
        MyThread1 t2 = new MyThread1(obj, 100);

        t1.start();
        t2.start();
    }

}


//class MyThread2 extends Thread {
//    Table t;
//
//    MyThread2(Table t) {
//        this.t = t;
//    }
//
//    public void run() {
//        t.printTable(100);
//    }
//
//}