package javabasic;

import java.util.Scanner;

public class alpha_diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int num = 0;
        int i, j, k;
        for (i = 1; i <= n; i++) {
            // for right spacing
            for (j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= (i * 2) - 1; k++) {
                System.out.print((char) (65 + num++));
            }
            num = 0;
            System.out.println();
        }
        // upside down triangle
        for (i = 1; i <= n - 1; i++) {
            for (j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (k = (n - i) * 2 - 1; k > 0; k--) {
                System.out.print((char) (65 + num++));
            }
            num = 0;
            System.out.println();
        }
    }
}
