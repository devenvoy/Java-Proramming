package OldPaperAns;

import java.util.Scanner;

public class StringMenu {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        String str = "";
        System.out.println("Enter String : ");
        str = sc.nextLine();


        while (true) {

            System.out.println();
            System.out.println("======================================================");
            System.out.println("                       Menu                           ");
            System.out.println("======================================================");
            System.out.println("\t1.Extract All Vowels");
            System.out.println("\t2.Extract All Non - Vowels");
            System.out.println("\t3.Convert To Uppercase");
            System.out.println("\t4.Convert To Lowercase");
            int ch = sc.nextInt();
            int vowels = 0;
            int nonVowels = 0;

            for (char c : str.toCharArray()) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowels += 1;
                } else {
                    nonVowels += 1;
                }
            }


            switch (ch) {
                case 1:
                    System.out.println("Number of Vowels in String : " + vowels);
                    break;
                case 2:
                    System.out.println("Number of Non Vowels in String : " + nonVowels);
                    break;
                case 3:
                    System.out.println(str.toLowerCase());
                    break;
                case 4:
                    System.out.println(str.toUpperCase());
                    break;
                default:
                    System.out.println("\nInvalid Choice\n");
            }

            System.out.println("Want To continue ( Yes -> y Or No -> n ) ");
            String con = sc.next();
            if (con.equalsIgnoreCase("y")) {
                continue;
            } else {
                break;
            }

        }

    }
}
