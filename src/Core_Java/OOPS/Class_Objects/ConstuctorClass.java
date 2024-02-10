package Core_Java.OOPS.Class_Objects;

public class ConstuctorClass {

	public static void main(String[] args) {
		
		// Constructor used to initialize an object 
		
		Human human = new Human("Rick",34,55.6);
		
		Human human2 = new Human("Morty",18,56);

		human.drink();
		human2.eat();
	}
}
