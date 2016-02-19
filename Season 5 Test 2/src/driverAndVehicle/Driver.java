package driverAndVehicle;

import vineteTask.GasStation;
import vineteTask.Vinete;

public class Driver {
	private String name;
	private Vehicle[] vehicles;
	private int freePlaces;
	private double money;
	private GasStation gasStation; // TODO??
	
	
	public void getVineteForVehicle(int numberOfVehicle, Vinete vinete) {
		vehicles[numberOfVehicle].setVinete(vinete);
	}
	
	public void getVineteForAllVehicles() {
		//TODO
		for(int i = 0; i < this.vehicles.length - this.freePlaces; i++) {
			//this.vehicles[i].setVinete(vinete);
		}
	}
}
