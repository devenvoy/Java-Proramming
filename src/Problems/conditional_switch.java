package Problems;

import java.util.Scanner;

public class conditional_switch {
    public static void main(String[] args) {

        // break; it stop that case , loop and exit from the current flow to next
        // statement
        // continue; it skip or ignore that block one time and again evaluate from start

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter day number of week:");
        int day = sc.nextInt();
        sc.close();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid Input");
                break;
        }

    }

}
