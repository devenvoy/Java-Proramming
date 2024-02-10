package Problems;

import java.util.Scanner;

public class prime_triange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt(); // denoting the lenght of pattern
        int number = 3;
        int d = x1-1; // line number or equal to number of space at each line
        for (int i = 1; i <= x1; i++) {
            for (int k = 1; k <= d; k++) {
                System.out.print(" ");
            }
            if (i == 1) {
                System.out.print("2");
            } else {
                for (int j = 0; j != i;) {
                    if (isPrime(number)) {
                        j++;
                        System.out.print(number + " ");
                    }
                    number++;
                }
            }
            System.out.println();
            d--;
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
