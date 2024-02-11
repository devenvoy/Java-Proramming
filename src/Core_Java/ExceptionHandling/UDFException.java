package Core_Java.ExceptionHandling;

import java.util.Scanner;

// User Defined Exceptions
public class UDFException {
    public static void main(String[] args) throws PriceException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age");
        int age = sc.nextInt();
        try {
            checkAge(age);
        } catch (Exception e) {
            System.out.println("A Problem Occured\n" + e);
        }

        int price = -123;
        checkPrice(price);

    }

    static void checkPrice(int price) throws PriceException {
        if (price < 0) {
            throw new PriceException(price);
        } else {
            System.out.println("Your Price is " + price);
        }
    }

    static void checkAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("\nYou Must be 18+ Older to Sign Up");
        } else {
            System.out.println("You Are Now Sign Up");
        }
    }
}
