package OldPaperAns;

import java.util.Scanner;

public class Book implements Comparable<Book> {

    Scanner sc = new Scanner(System.in);
    int id;
    final String title;
    final String author;
    final String publication;
    final String price;

    public Book(int id) {
        this.id = id;
        System.out.println("Enter Title Name:");
        title = sc.nextLine();
        System.out.println("Enter Author Name:");
        author = sc.nextLine();
        System.out.println("Enter Publisher Name:");
        publication = sc.nextLine();
        System.out.println("Enter Book Price");
        price = sc.nextLine();
    }

    @Override
    public int compareTo(Book o) {
        return title.compareTo(o.title);
    }

    public void display() {
        System.out.print(id + " :");
        System.out.print(" " + title);
        System.out.print(" : " + author);
        System.out.print(" : " + publication);
        System.out.println(" : " + price);
    }

}
