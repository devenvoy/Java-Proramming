package Core_Java;

public class Arrayss {
	public static void main(String[] args) {

		// Array
		String[] cars = { "Camaro", "Corvette", "tesla" };

		System.out.println(cars[0]);
		System.out.println(cars[1]);
		System.out.println(cars[2]);

		String[] cars1 = new String[3];

		cars1[0] = "Tesla";

		for (int i = 0; i < cars1.length; i++) {
			System.out.println(cars1[i]);
		}

	}
}
