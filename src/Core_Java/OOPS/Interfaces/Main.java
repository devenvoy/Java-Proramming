package Core_Java.OOPS.Interfaces;


public class Main {
    public static void main(String[] args) {

        /*
         Interface can be Implemented not Extended
         Multiple interface can be implements in one class
         interface is by default abstract class, and all its methods are also abstract method
         Unlike Abstract class interface can't contain any non-abstract method in it
         child class must need to Override all implemented class methods in it
         all Override method in child inheriting from interface need to made public in child class
         You can define property in interface
         property defined in interface can't be changed as they are final byDefault
         */

        cat c1 = new cat();
        c1.voice();

        dog d1 = new dog();
        d1.voice();
    }
}

class dog implements animal {
    @Override
    public void voice() {
        System.out.println("Bark Bark");
    }
}

class cat implements animal {
    @Override
    public void voice() {
        System.out.println("Meow Meow");
    }
}