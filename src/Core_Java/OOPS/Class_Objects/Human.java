package Core_Java.OOPS.Class_Objects;

public class Human {

	String name;
	int age;
	double weight;
	
	// Default Constructor 
	Human() {
		
	}
	
	// parameterized Constructor
	Human(String name,int age , double weight){
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	void eat() {
		System.out.println(this.name+" is Eating");
	}
	
	void drink() {
		System.out.println(this.name+" is Drinking");
	}
}

