package Core_Java;

import java.util.Random;

public class RandomNum {

	public static void main(String[] args) {
		Random random = new Random();

		int n = random.nextInt();
		System.out.println(n);
		int diceSide = random.nextInt(6) + 1; // btw ( 0 to 5 ) + 1
		System.out.println(diceSide);

		double y = random.nextDouble();
		System.out.println(y);

		boolean z = random.nextBoolean();
		System.out.println(z);
	}

}
