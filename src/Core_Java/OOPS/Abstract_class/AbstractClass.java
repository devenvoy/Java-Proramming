package Core_Java.OOPS.Abstract_class;

public class AbstractClass {
	public static void main(String[] args) {

//		Vehicle vahicle = new Vehicle();
		Vehicle bike = new Bike();
		bike.go();
		bike.horn();

		// Vehicle is an Abstract Class
		// We cannot create Instance of an Abstract class
		// It can be extended by another child class
		//one method should be abstract method to Create abstract class
		// Unlike Interface it can contain not abstract methods
		// abstract method must need to be Override by child class in it
	}

}
