package Problems;

import java.util.Scanner;

public class ascii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.println("::Ascii value of any character:: ");
        System.out.println();
        System.out.println("Enter character here: ");
        char c = sc.next().charAt(0);
        int ascii = (int) c;
        System.out.println("Ascii value method 1 :" + ascii);
        System.out.println("Ascii value method 2 :" + (int)c);

    }
}
