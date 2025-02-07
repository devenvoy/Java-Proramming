package Problems;

import java.util.*;;

public class readChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // char input
        // no direct method to input char in java
        System.out.println("Enter Any word:");
        char a = sc.next().charAt(0);
        sc.close();
        System.out.println("The Character is: " + a);
        System.out.println("Entered char is " + a);

    }
}
