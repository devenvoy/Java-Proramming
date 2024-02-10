package Core_Java.Conditionals;

public class If_else {

	public static void main(String[] args) {
		int age = 12;
		
		if(age >= 75) {
			System.out.println("Ok Boomer!");
		}else if(age >= 12){
			System.out.println("You are a Teenager");
		}else if(age >= 18) {
			System.out.println("You are an Adult");
		}else {
			System.out.println("You are not and adult");
		}

	}

}
