package Core_Java;

import java.util.Scanner;

public class middlechar_s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string here:");
        String str = sc.nextLine();
        sc.close();
        System.out.println(middle(str));
    }

    public static String middle(String s) {
        if (s.length() % 2 == 0) {
            return s.substring(s.length() / 2 - 1, s.length() / 2 + 1);
        } else {
            return s.substring(s.length() / 2, s.length() / 2 + 1);
        }
    }
}
