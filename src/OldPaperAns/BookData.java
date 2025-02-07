package OldPaperAns;

import java.util.Arrays;
import java.util.Scanner;

public class BookData {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Number of Books");
        int n = sc.nextInt();

        Book[] books = new Book[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nBook : " + (i + 1));
            books[i] = new Book(i + 1);
        }

        Arrays.sort(books);

        System.out.println("ID : Title : Author : Publication : Price");
        for (int i = n - 1; i >= 0; i--) {
            try {
                Thread.sleep(1000);
                books[i].display();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
