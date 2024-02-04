package Core_Java;

public class OverloadMethods {

	public static void main(String[] args) {
		// Overload Methods - Same name 
		// But With Different Parameters By Type or number of args

		System.out.println(add(27, 34));
		System.out.println(add(23, 44, 5));
		System.out.println(add(25, 5.0));

	}

	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}
	
	static double add(int a, double b) {
		return a+b;
	}
}
