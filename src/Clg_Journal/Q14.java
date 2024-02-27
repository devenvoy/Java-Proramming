package Clg_Journal;

public class Q14 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int rev = 0;
        while (num != 0) {
            int r = num % 10;
            rev = rev * 10 + r;
            num /= 10;
        }
        while (rev != 0) {
            int r = rev % 10;
            try {
                System.out.print(r);
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            rev /= 10;
        }

    }
}
