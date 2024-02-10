package Core_Java.OOPS.Class_Objects;


// object - instance of Class / Copy of class
// attributes - characteristics of object
// Method - action to perform on object from object

public class Oop_class {

	public static void main(String[] args) {
		
		// Object 
		Car myCar = new Car();
		
		System.out.println(myCar.make);
		System.out.println(myCar.model);
		
		myCar.drive();
		
		myCar.cbreak();
		System.out.println();
		
		// second Object 
		Car myCar2 = new Car();
		
		System.out.println(myCar2.make);
		System.out.println(myCar2.model);
		
		
	}
}
