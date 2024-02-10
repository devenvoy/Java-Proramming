package Core_Java.OOPS.Class_Objects;

public class Car {
	
	String make = "Chevrolet";
	String model = "Corvette";
	int year = 2020;
	String color = "Blue";
	double price = 50000.000;
	
	Car(){}
	
	Car(String name){
		make = name;
	}
	
	void drive() {
		System.out.println("You are Driving Car");
	}
	
	void cbreak() {
		System.out.println("You step on breaks");
	}
}
