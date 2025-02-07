package Problems;

import java.util.Scanner;

public class ifelseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Any number: btw(0 To 99)");
        int num = sc.nextInt();
        sc.close();
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        if (num <= 12) { 
            System.out.println(" he/ She is child");
        } else if (num > 12 && num <= 18) {
            System.out.println(" He / She is teenager");
        } else {
            System.out.println(" He / She is adult");
        }

        // instead of using if else use ternary operator 
        // syntax ::  expression ? true then this : false then this; 
        System.out.println(num % 2 == 0 ? "Even" : "Odd");
    }
}
