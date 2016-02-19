package vineteTask;

public class Driver {
	private String name;
	private Vehicle[] vehicles;
	private double money;
	private GasStation gasStation; // TODO??
	
	
	public void getVineteForVehicle(int numberOfVehicle, Vinete vinete) {
		vehicles[numberOfVehicle].setVinete(vinete);
	}
	
	public void getVineteForAllVehicles() {
		//TODO
	}
}
