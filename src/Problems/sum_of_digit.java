package Problems;

import java.util.Scanner;

public class sum_of_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number :");
        int num = sc.nextInt();

        int rem;
        int sum = 0;

        while(num != 0){
            rem = num % 10;
            sum += rem;
            num /= 10;
        }

        System.out.println("Sum of digits of number is "+sum );

    }
}
