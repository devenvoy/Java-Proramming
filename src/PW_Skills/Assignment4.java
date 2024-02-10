package PW_Skills;

import java.util.Scanner;

public class Assignment4 extends AnswerSheet {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        AnswerSheet s1 = new Assignment4();
        s1.display();

    }

    //    Q1 - Write a program which takes the values of length and breadth from user and check if it is
    //    a square or not.
    @Override
    void Q1Answer() {
        System.out.println("Enter Length:");
        int length = sc.nextInt();
        System.out.println("Enter Breadth:");
        int breadth = sc.nextInt();
        if (length == breadth) {
            System.out.println("Square");
        } else {
            System.out.println("Rectangle");
        }
    }

    //Q2 - Write a program to print the absolute value of a number entered by the user.
    @Override
    void Q2Answer() {
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println(num * -1);
        } else {
            System.out.println(num);
        }
    }

    //Q3 - Write a program to take input from user for Cost Price (C.P.) and Selling Price(S.P.) and
    //    calculate Profit or Loss.
    @Override
    void Q3Answer() {
        System.out.println("Enter Cost Price:");
        int cp = sc.nextInt();
        System.out.println("Enter Selling Price:");
        int sp = sc.nextInt();
        if (sp - cp > 0) {
            System.out.println("Profit " + (sp - cp));
        } else if (cp - sp < 0) {
            System.out.println("Loss " + (cp - sp));
        }
    }

    //    Q4 - Write a program to print positive number entered by the user, if user enters a negative
    //    number, it is skipped
    @Override
    void Q4Answer() {
        int x;
        System.out.print("Enter the Number : ");
        x = sc.nextInt();
        if (x >= 0) {
            System.out.print("You entered a positive number");
        } else {
            System.out.print("You number is negative and is skipped");
        }
    }

    //    Q5 - Create a calculator using a switch statement to perform addition, subtraction, multiplication
    //    and division.
    @Override
    void Q5Answer() {

    }
}
