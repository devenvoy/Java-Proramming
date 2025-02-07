package OldPaperAns;

import java.util.Scanner;

public class Student implements Comparable<Student> {

    String name;
    int rollno;
    static Scanner sc = new Scanner(System.in);

    @Override
    public int compareTo(Student s) {
        return name.compareTo(s.name);
    }

    Student() {
        System.out.println("Enter Name : ");
        name = sc.nextLine();
        System.out.println("Enter RollNo");
        rollno = sc.nextInt();
    }

    public void display() {
        System.out.println("Name : " + name + " Roll no : " + rollno);
    }

}
