package Core_Java;

import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year:");
        int year = sc.nextInt();
        System.out.println();
        sc.close();
        if (is_leapyear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    public static boolean is_leapyear(int y) {
        boolean a, b, c;
        a = y % 4 == 0;
        b = y % 100 != 0;
        c = y % 100 == 0 && y % 400 == 0;

        return a && (b || c);
    }
}
