package Core_Java.OOPS.Overload_method;

public class Pizza {

	String bread;
	String sauce;
	String cheese;
	String topping;
	
	// Overloaded Constructors
	
	// Pizza Without topping and cheese
		Pizza(String b,String s) {
			this.bread = b;
			this.sauce = s;
		}
	
	// Pizza Without topping
	Pizza(String b,String s,String c) {
		this.bread = b;
		this.sauce = s;
		this.cheese = c;
	}
	
	Pizza(String b,String s,String c,String t) {
		this.bread = b;
		this.sauce = s;
		this.cheese = c;
		this.topping = t;
	}
	
	void details() {
		System.out.println("Here are the ingredients of your Pizza:");
		System.out.println(bread+", "+sauce+", "+cheese+", "+topping);		
	}
}
