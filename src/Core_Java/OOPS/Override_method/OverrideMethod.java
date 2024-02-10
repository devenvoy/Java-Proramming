package Core_Java.OOPS.Override_method;

public class OverrideMethod {

	public static void main(String[] args) {
		
		// Method Override - Declaring a method in subclass which is already present in parent class.
		// done so that a child class can give its own implementation
		
		Animal animal = new Animal();
		Dog dog = new Dog();
		
		animal.speak();
		dog.speak();
		
		// same method name but implementation is different 
	}
}
