
public class Main {

	int abc = 90; //instance variable //heap area
    static int bcd = 901;	//Method area
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int marks = 780; //stack area
		
		System.out.println("Good evening ALL! Day-2");
		Main obj = new Main(); //1
		//obj ref
		System.out.println(obj.abc);
		obj.abc=9000;
		System.out.println(obj.abc);
		//object
		System.out.println(new Main().abc); //90
		//1. directly, className, objref, object -> static
		System.out.println(bcd);
		System.out.println(Main.bcd);
		System.out.println(obj.bcd);
		System.out.println(new Main().bcd);
		
		System.out.println(marks); //directly -> local
	}

}


//Inclass Day-2 Challenge2:
//
//1. Create a Java program that models a basic vehicle system. The program should include the following requirements:
//2. Abstraction: Create an abstract class Vehicle with abstract methods for starting the vehicle, stopping the vehicle, and displaying vehicle details.
//3. Interfaces: Define an interface ElectricVehicle that declares methods for charging the vehicle and displaying the battery level.
//4. Inheritance: Create two classes Car and Bike that inherit from the Vehicle class. The Car class should implement the ElectricVehicle interface.
//5. Implement the required methods in the Car and Bike classes.
//6. In the main method, create instances of Car and Bike, invoke their methods, and display the output.



