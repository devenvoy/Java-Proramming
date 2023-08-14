package Std_XII;

class Prime {
    static boolean isPrime(int n) {
        int i, last;
        if (n <= 1) return false;
        if (n < 4) return true;

        last = (int) Math.sqrt(n);
        i = 3;
        do {
            if (n % i == 0) return false;
            i = i + 2;
        } while (i < last);

        return true;
    }
}

public class U8_5 {
    public static void main(String[] args) {

        int n;
        System.out.println("Prime numbers between 3 to 100: ");
        for (n = 3; n < 100; n = n + 2) {
            if (Prime.isPrime(n))
                System.out.println(n);
        }
    }
}



