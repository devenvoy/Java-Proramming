package javabasic;

import java.util.*;

class algebra {

    // variable with scope of this class
    // it can be use in any method or other purpose in this class only
    int a, b;

    // creating a constructer
    // parameterized
    algebra(int x, int y) {

        System.out.println("Constructer of algebra class called ");
        a = x;
        b = y;
    }

    // this are methods which are using variable that has class scope
    // int is return type its next is method name to use for call method
    int add() {
        return a + b;
    }

    int sub() {
        return a - b;
    }

    int mul() {
        return a * b;
    }

    int div() {
        return a / b;
    }
}

public class basic_constructers {

    public static void main(String[] args) {
        // creating a object of algebra class
        // when creaing a object constructer always calls
        // all class has its default constructer if it isnot defined
        algebra obj = new algebra(5, 7);
        Scanner sc = new Scanner(System.in);

        System.out.println(obj.add());
        System.out.println(obj.sub());
        System.out.println(obj.mul());
        System.out.println(obj.div());

        algebra obj2 = new algebra(10, 7);

        System.out.println(obj2.add());
        System.out.println(obj2.sub());
        System.out.println(obj2.mul());
        System.out.println(obj2.div());

    }
}
