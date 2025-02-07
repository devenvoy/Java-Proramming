package Problems;

import java.util.Scanner;

public class swap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int no1, no2, temp;

        System.out.println("Program to swap numbers:");
        System.out.print("Enter No 1:");
        no1 = sc.nextInt();
        System.out.print("Enter No 2:");
        no2 = sc.nextInt();
        sc.close();
        // Swap number using third variable
        temp = no1;
        no1 = no2;
        no2 = temp;
        System.out.println("No 1 : " + no1);
        System.out.println("No 2 : " + no2);

        // Swap Number without using variable
        no1 = no1 + no2;
        no2 = no1 - no2;
        no1 = no1 - no2;
        System.out.println("No 1 : " + no1);
        System.out.println("No 2 : " + no2);

    }
}
