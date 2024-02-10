package Core_Java.Operators;

import java.util.Scanner;
public class expressions_ops {

	public static void main(String[] args) {
		
		// Arithmatic Operator 
		int num = 10;
		num = num + 10;  // 20
		num = num - 5;   // 15
		num = num * 2;   // 30
		num = num / 3;   // 10
		num = num % 3;   // 1

		System.out.println(num);
		
		// 
		int num2 = 3;
		num2++;
		System.out.println(num2);
		num2--;
		num2--;
		System.out.println(num2);
		
		// Comparison Operator
		int temp = 30;
		if(temp > 30)  System.out.println("Normal");
		if(temp < 30)  System.out.println("Not Normal");
		if(temp >= 25) System.out.println("Near Normal");
		if(temp <= 25) System.out.println("Cold");
		
		// Logical Operator
		Scanner sc = new Scanner(System.in);
		System.out.println("You are Playing A Game !\nPress q or Q to Quit");
		String response = sc.next();
		
		if(response.equals("q") || response.equals("Q")){
			System.out.println("You Quit the Game ");
		} else {
			System.out.println("You Still Playing Game ");
		}
		
	}

}
