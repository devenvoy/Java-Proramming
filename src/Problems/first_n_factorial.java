package Problems;

import java.util.Scanner;

public class first_n_factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int factorial = 1;
        int n = sc.nextInt();

        for (int i = 1;i<=n;i++){
            factorial = factorial*i;
            System.out.println("Factorial of "+i+" is "+factorial);
        }

    }
}
