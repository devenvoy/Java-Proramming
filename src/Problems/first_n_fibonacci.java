package Problems;

import java.util.Scanner;

public class first_n_fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many elements you want in Fibonacci Series:");
        int n = sc.nextInt();
        int n1 = 0;
        int n2 = 1;

        int n3 = n1 + n2;
        int i = 0;

        System.out.print(n1 + " " + n2 + " " + n3 + " ");

        while (i <= n-3) {
            n1 = n2;
            n2 = n3;
            n3 = n1 + n2;
            i++;
            System.out.print(n3 + " ");
        }
    }
}
