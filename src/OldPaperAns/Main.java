package OldPaperAns;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int op;
        Scanner sc = new Scanner(System.in);
        System.out.println("*linkedlist opretion");

        menu:
        do {
            System.out.println("1.insert a node at end of the list.");
            System.out.println("2.insert a node at beggiing of the list.");
            System.out.println("3.insert a node at paticulat.");
            System.out.println("4.Delete a node at end of the list.");
            System.out.println("5.Delete a node at end of the list.");
            System.out.println("6.Exit");
            System.out.println();
            System.out.print("Enter a opretion between 1 to 6 =");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break menu;
            }
        } while (true);

    }
}