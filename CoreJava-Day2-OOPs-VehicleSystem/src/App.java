
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Bike b = new Bike();
       b.displayVehicleDetails();
       b.startVehicle();
       b.stopVehicle();
       Car c = new Car();
       c.displayVehicleDetails();
       c.startVehicle();
       c.chargingVehicle();
       c.displayBatteryLevel("95");
       c.stopVehicle();
	}

}
