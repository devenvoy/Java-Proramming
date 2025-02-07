package Clg_Journal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;

        try {
            num1 = sc.nextInt();
            num2 = sc.nextInt();

            int div = num1 / num2;

            System.out.println(num1 + " / " + num2 + " = " + div);
        } catch (InputMismatchException e) {
            System.out.println("Enter Integer Values Only ");
        } catch (ArithmeticException e) {
            System.out.println("You Can't Divide any number with Zero \n" + e);
        }
        finally {
            sc.close();
        }
    }
}
