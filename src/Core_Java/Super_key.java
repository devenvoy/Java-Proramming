package Core_Java;

public class Super_key {

	public static void main(String[] args) {
		
		Hero hero1 = new Hero("Batman", 42, "$$$");
		Hero hero2 = new Hero("Superman", 33, "Everything");
	
		System.out.println(hero1.name);
		System.out.println(hero1.age);
		System.out.println(hero1.power);
		
		System.out.println("\n\n"+hero2.toString());
		
	}
	
}
