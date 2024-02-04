package Core_Java;

public class Object_Args {

	public static void main(String[] args) {
		
		Garage garage = new Garage();
		
		Car car = new Car("BMW");
		Car car2 = new Car("Tesla");
		
		// Sending Argument as Object To Method 
		garage.park(car);
		
		garage.park(car2);
	}
}
