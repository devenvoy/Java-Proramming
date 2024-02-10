package Core_Java.Conditionals;

public class SwitchCase {

	public static void main(String[] args) {
		
		String day = "Pizza"; // "Sunday"
		
		switch(day){
			case "Sunday":
				System.out.println("It is Sunday!!");
				break;
			case "Monday":
				System.out.println("it is Monday");
				break;
			case "Tuesday":
				System.out.println("it is Tuesday");
				break;
			case "WednesDay":
				System.out.println("it is WednesDay");
				break;
			case "Thursday":
				System.out.println("it is Thursday");
				break;
			case "Friday":
				System.out.println("it is Friday");
				break;
			case "Saturday":
				System.out.println("it is Saturday");
				break;
			default:
				System.out.println("This is not a Day!!!!!");
				
		}
	}

}
