package Problems;

import java.util.Scanner;

public class reverse_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number :");
        int num = sc.nextInt();
        sc.close();
        int rem;
        int rev = 0;

        while (num != 0) {
            rem = num % 10;
            rev = (rev * 10) + rem;
            num /= 10;
        }

        System.out.println("Reverse of number is " + rev);

    }
}
