package PW_Skills;

import java.util.Scanner;

public class Assignment2 implements AnswerSheet {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Assignment2 a = new Assignment2();
        System.out.println("Answer 1 ==>");
        a.Q1Answer();
        System.out.println("\nAnswer 2 ==>");
        a.Q2Answer();
        System.out.println("\nAnswer 3 ==>");
        a.Q3Answer();
        System.out.println("\nAnswer 4 ==>");
        a.Q4Answer();
        System.out.println("\nAnswer 5 ==>");
        a.Q5Answer();
    }

    //    Q1 - Input name, roll number and field of interest from user and print in the format below :
    @Override
    public void Q1Answer() {
        String name;
        int roll_no;
        String FOI;
        System.out.println("Enter Your name :");
        name = sc.nextLine();
        System.out.println("Enter Your Roll no :");
        roll_no = sc.nextInt();
        System.out.println("Enter Your Field of Interest :");
        FOI = sc.next();

        System.out.println("Name: " + name);
        System.out.println("Roll no: " + roll_no);
        System.out.println("Field of Interest: " + FOI);

    }


    //    Q2 - Input two different strings and print them in the same line.
    @Override
    public void Q2Answer() {
        String first = sc.nextLine();
        String second = sc.nextLine();
        System.out.println(first + second);
    }

    //    Q3 - If the marks of Robert in three subjects are entered through keyboard (each out of
    @Override
    public void Q3Answer() {
        System.out.println("Enter 3 Subjects Marks out of 100:");
        int mark1 = sc.nextInt();
        int mark2 = sc.nextInt();
        int mark3 = sc.nextInt();
        int total = mark1 + mark2 + mark3;
        float per = total / 3.0F;
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage Marks: " + per + "%");

    }

    //    Q4 - Given two numbers, return their sum in the following format:
//               Int t representing number of test cases
//               T lines of Two integers representing the numbers to be added
    @Override
    public void Q4Answer() {
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);
        }
    }

    //    Q5 - Given few lines of input (number of lines unknown) where each line has two strings,
    //    concatenate the strings.
    @Override
    public void Q5Answer() {
        // to end loop, press ctrl + c or ctrl + d
        while (sc.hasNextLine()) {
            String a = sc.next();
            String b = sc.next();
            System.out.println(a + b);
        }
    }


}
