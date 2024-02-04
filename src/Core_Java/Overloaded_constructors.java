package Core_Java;

public class Overloaded_constructors {

	public static void main(String[] args) {
		
		Pizza pizza = new Pizza("thicc crust","tomato","mozzerella","pepperoni");
		
		pizza.details();
		
		System.out.println();
		Pizza pz2 = new Pizza("Thin", "Meranara");
		pz2.details();
 	}
}
