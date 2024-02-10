package Core_Java.OOPS.Class_Objects;

public class Method_functions {

	public static void main(String[] args) {
		
		String name = "Devansh";
		int age = 18;
		hello(name,age);
		
		int x = 24;
		int y = 56;
		System.out.println(add(x,y));
	}
	
	static void hello(String name , int age) {
		System.out.println("Hello "+name);
		System.out.println("You are "+age);
	}
	
	static int add(int a , int b) {
		return a+b;
	}

}
