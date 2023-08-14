package javabasic;

import java.util.Scanner;
import java.lang.*;

public class Compound_intrest {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        double p = sc.nextDouble();
        System.out.print("Enter the rate: ");
        double r = sc.nextDouble();
        System.out.print("Enter the time in year: ");
        double t = sc.nextDouble();
        System.out.print("Enter the number of times that \ninterest is compounded per year: ");
        int n = sc.nextInt();

    
        double amt = p*(Math.pow((1+r/100),t));
        System.out.println("The compounded amount is: "+amt);
    }
}
