package Core_Java.OOPS.Polymorphism;

class Polymorphism {

    public static void main(String[] args) {

        // Static polymorphism
        // here which overridden method call decided at compile time
        // early binding
        Bike bike = new Bike();
        Bike2 bike2 = new Bike2();

        bike.run();
        bike2.run();

        // Dynamic Polymorphism
        // Here which version of overridden method will be called decide at runtime
        // late binding
        Vehicle a = new Vehicle();
        Bike b = new Bike();
        Bike2 c = new Bike2();

        Vehicle r;

        // here r refers to object a
        r = a;
        r.run();

        // here r refers to object b
        r = b;
        r.run();

        // here r refers to object c
        r = c;
        r.run();
    }
}

class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle {
    @Override
    void run() {
        System.out.println("Bike is running safely");
    }
}

class Bike2 extends Bike {
    @Override
    void run() {
        System.out.println("Bike2 is in Service");
    }
}


