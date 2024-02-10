package Core_Java.Arrays;

public class ObjectsArray {
	public static void main(String[] args) {

		// Array of Objects 
		// which stores references of each object
		Food[] refregirator = new Food[3];

		refregirator[0] = new Food("Pizza");
		refregirator[1] = new Food("Pasta");
		refregirator[2] = new Food("Burger");
		
		// Or 
		
		Food food1 = new Food("Pizza");
		Food food2 = new Food("Pasta");
		Food food3 = new Food("Burger");
		
		Food[] refregirator2 = {food1,food2,food3};
		
		System.out.println(refregirator[0].toString());
		System.out.println(refregirator[1].toString());
		System.out.println(refregirator[2].toString());
		
	}
}
