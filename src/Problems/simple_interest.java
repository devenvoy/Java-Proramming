package Problems;

import java.util.Scanner;

public class simple_interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Floating point input
        System.out.print("Enter principal amount :");
        float p = sc.nextFloat();

        System.out.print("Enter interest rate :");
        float i = sc.nextFloat();

        System.out.print("Enter Duration in months :");
        float d = sc.nextFloat();
        float t = d / 12;
        float si = (p * i * t) / 100;
        sc.close();
        System.out.println("Principle :" + p);
        System.out.println("Rate of interest :" + i);
        System.out.println("Duration of time :" + t + " year");
        System.out.println("Simple interest :" + si);

    }
}
