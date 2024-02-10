package Core_Java.DataTypes;

public class Variable_Scope {

	public static void main(String[] args) {
		
		System.out.println("From Constructor");
		DiceRoller dice = new DiceRoller();
		
		System.out.println("Again Manually");
		dice.roll();
	}
}
