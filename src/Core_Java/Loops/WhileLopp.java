package Core_Java.Loops;

import java.util.Scanner;

public class WhileLopp {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String name = "";

		while (name.isBlank()) {
			System.out.println("Enter Your Name:");
			name = scanner.nextLine();
		}

		System.out.println("Hello " + name);

		name = "";
		do {
			System.out.println("Enter Your Name");
			name = scanner.nextLine();
		} while (name.isBlank());
		scanner.close();
	}
}
