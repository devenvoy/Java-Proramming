package Core_Java;

import java.util.Scanner;

// Count Vowels in String
public class vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the line here:");
        String str = sc.nextLine();
        sc.close();
        System.out.println(count(str));
    }

    public static int count(String s) {

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            int ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }

        }
        return count;
    }
}
