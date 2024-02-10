package Problems;

import java.util.*;

class person {

    Scanner sc = new Scanner(System.in);
    String name;
    int age;

    void get_data() {

        System.out.print("Enter name:");
        name = sc.next();

        System.out.print("Enter your age :");
        age = sc.nextInt();

    }

    void show() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }

}

// This is extends example
// this added all methods from person into student class
class student extends person {
    int roll_no;

    student() { // constructer
        roll_no = 12;
    }

    void disp() {
        show();
        System.out.println("Roll no : " + roll_no);
    }
}

class extend_example {

    public static void main(String[] args) {
        student s1 = new student();
        s1.get_data();
        s1.disp();

    }

}
