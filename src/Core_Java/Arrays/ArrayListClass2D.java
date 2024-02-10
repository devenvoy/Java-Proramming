package Core_Java.Arrays;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListClass2D {

	public static void main(String[] args) {
		
		ArrayList<ArrayList<String>> groceryList = new ArrayList<ArrayList<String>>();
		
		ArrayList<String> bakeryList = new ArrayList<String>();
		bakeryList.add("Pasta");
		bakeryList.add("garlic bread");
		bakeryList.add("donuts");
		
		ArrayList<String> produceList = new ArrayList<String>();
		produceList.add("tomatoes");
		produceList.add("zucinni");
		produceList.add("peppers");
		
		ArrayList<String> drinkList = new ArrayList<String>();
		drinkList.add("coke");
		drinkList.add("fanta");
		
		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinkList);
		
		System.out.println(groceryList);
		System.out.println(groceryList.get(2));
		System.out.println(groceryList.get(0).get(1));

	}
}
