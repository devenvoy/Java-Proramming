package OOPS;

import java.util.Scanner;

public class loop_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year:");
        int year = sc.nextInt();
        System.out.println();
        if(is_leapyear(year)){
            System.out.println(year+" is a leap year.");
        } else {
            System.out.println(year+" is not a leap year.");
        }
    }
    public static boolean is_leapyear(int y ){
        boolean a,b,c;
        a = y%4 == 0;
        b = y%100 != 0;
        c = y%100 == 0 && y%400 == 0;

        return a && (b||c);
    }
}
