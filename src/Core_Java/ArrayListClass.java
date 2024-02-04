package Core_Java;

import java.util.ArrayList;

public class ArrayListClass {

	public static void main(String[] args) {
		
		// Mutable List without size declared 
		// Dynamic Size
		// Use Wrapper Class as Data Type 
		// Integer for int 
		
		ArrayList<String> food = new ArrayList<String>();
		
		// add value at last index 
		food.add("Pizza");
		food.add("Hamburger");
		food.add("Hotdog");
		
		// set value at index 
		food.set(0, "Shushi");
		
		// remove value from index 
		food.remove(2);
		
		for(int i=0; i<food.size();i++) {
			System.out.println(food.get(i));
		}
		
		// remove all values
		food.clear();
	}
}
