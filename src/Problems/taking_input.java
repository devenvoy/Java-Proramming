package Problems;

import java.util.Scanner;

public class taking_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Integer input
        System.out.print("Enter A number: ");
        int num_1 = sc.nextInt();

        // String input
        System.out.print("Enter your name: ");
        String name = sc.next();

        sc.nextLine();

        // String line input
        System.out.print("Enter about yourself: ");
        String data1 = sc.nextLine();

        System.out.println();
        System.out.println("Number is :" + num_1);
        System.out.println("Your name is  :" + name);
        System.out.println("bio  :   " + data1);


    }
}
