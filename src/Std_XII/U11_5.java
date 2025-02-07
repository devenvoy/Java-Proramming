package Std_XII;

import java.util.InputMismatchException;
import java.util.Scanner;

public class U11_5 {
    public static void main(String[] s) {
        Scanner scan = null;
        int sum = 0;
        int num1, num2;
        try {
            scan = new Scanner(System.in);
            System.out.println("first num:");
            num1 = scan.nextInt();
            // boolean flag = scan.nextBoolean();
            // double db = scan.nextDouble();
            scan.nextLine();
            // String name = scan.nextLine();
            System.out.println("second num:");
            num2 = scan.nextInt();

            sum = num1 + num2;
            System.out.println("sum of two numbers:" + sum);
        } catch (InputMismatchException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                scan.close();

            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

}
