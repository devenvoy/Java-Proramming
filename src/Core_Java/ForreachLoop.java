package Core_Java;


import java.util.ArrayList;

public class ForreachLoop {

	public static void main(String[] args) {

		String[] animals = { "Cat", "Dog", "Rat", "Bird" };

		for (String string : animals) {
			System.out.println(string);
		}

		ArrayList<String> animal2 = new ArrayList<>();

		animal2.add("Cat");
		animal2.add("Dog");
		animal2.add("Hippo");
		animal2.add("Lion");
		
		for (String str : animal2) {
			System.out.println(str);
		}

		
	}

}
