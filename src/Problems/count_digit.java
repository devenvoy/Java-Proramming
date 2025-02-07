package Problems;

import java.util.Scanner;

public class count_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number :");
        int num = sc.nextInt();
        sc.close();
        int count = 0;

        while (num != 0) {
            num /= 10;
            count++;
        }

        System.out.println("There are " + count + " digits in number.");

    }
}
