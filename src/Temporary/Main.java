package Temporary;

public class Main {


    static void Add(int a, int b) {
        System.out.println(a + b);
    }

    static void Add(int a, int b, int c) {
        System.out.println(a + b + c);
    }


    public static void test() throws ApplicationException {
        try {
            int a = 12 / 0;
        } catch (Exception e) {
            throw new ApplicationException(e.toString());
        }
    }

    static class ApplicationException extends Exception {
        ApplicationException(String msg) {
            super(msg);
        }
    }

    public static void main(String[] args) {

        try {
            test();
        } catch (ApplicationException e) {
            System.out.println(e.getMessage());
        }

        Add(10, 20);
        Add(10, 20, 30);


//        Animal a1;
//        a1 = new Animal();
//        a1.eat();
//        a1 = new Dog();
//        a1.eat();
//        a1 = new BabyDog();
//        a1.eat();

    }
}

class Animal {
    void eat() {
        System.out.println("Animal Eating");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("Dog is Eating");
    }
}

class BabyDog extends Dog {
    void eat() {
        System.out.println("Baby Dog is eating");
    }
}