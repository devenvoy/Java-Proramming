package Problems;

import java.util.Scanner;

public class cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number to find its cube:");
        int n = sc.nextInt();
        sc.close();
        int x = n * n * n;
        System.out.println("Cube of " + n + " is " + x);
    }
}
