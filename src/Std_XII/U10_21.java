package Std_XII;

import java.util.Scanner;

class InvalidMarksException extends java.lang.Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}

public class U10_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks;
        boolean continueLoop = true;
        do {
            System.out.print("Enter the mark:");
            marks = sc.nextInt();
            System.out.println("You Entered "+marks);
            try{
                if(marks < 0 || marks > 100){
                    continueLoop = false;
                    throw new InvalidMarksException("Wrong Marks..");
                } else {
                    System.out.println("Marks are valid");
                }
            } catch (InvalidMarksException eobj) {
                System.out.println("Exception caught: "+eobj);
            }
        } while (continueLoop);
    }
}
