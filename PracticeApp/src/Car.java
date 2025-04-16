
public class Car extends Vehicle implements ElectricVehicle{

	void displayVehicleDetails() {
		System.out.println("This is Audi Car");
	}
	
	public void chargingVehicle() {
		 System.out.println("The car is being charged");
	 }
		
    public void displayBatteryLevel(String value) {
    	 System.out.println("The current charging level is"+value);
     }
}
