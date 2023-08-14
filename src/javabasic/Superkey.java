package javabasic;

public class Superkey {

    public static void main(String[] args) {
//        A a1 = new A();
        B b1 = new B();
        b1.show();
    }
}

class A{
    A(){
        System.out.println("I am parent class.");
    }
    void show(){
        System.out.println("I am show method. from class A");
    }
}

// inherit A class and constructor in b
class B extends A {
    B(){
        System.out.println("I am child class.");
    }

    void show(){
        super.show();
        System.out.println("I am show method. from class B.");
    }
}


