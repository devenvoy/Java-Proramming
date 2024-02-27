package Clg_Journal;

public class Q15 {
    public static void main(String[] args) {
        int v = 0, c = 0;
        String str = args[0];
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                v++;
            } else {
                if (ch >= 97 && ch <= 122) {
                    c++;
                }
            }
        }
        System.out.println("Total number of vowels is " + v);
        System.out.println("Total number of consonants is " + c);

    }
}
