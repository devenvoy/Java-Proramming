package Core_Java.Strings;

import java.util.*;

public class toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // how to take input in stringbuilder
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println(str);
        sc.close();
        // toggle (if uppercase -> lowercase)

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!Character.isLetter(ch))
                continue;
            int asci = (int) ch;
            if (asci >= 97) {
                asci -= 32;
                str.setCharAt(i, (char) asci);
            } else {
                asci += 32;
                str.setCharAt(i, (char) asci);
            }
        }
        System.out.println(str);
    }
}
