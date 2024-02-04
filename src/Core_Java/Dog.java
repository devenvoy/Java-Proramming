package Core_Java;

public class Dog extends Animal{

//	@Override used to Override a Method 
	
	@Override
	void speak() {
		System.out.println("The Dog goes \"Bark\"");
	}
}
