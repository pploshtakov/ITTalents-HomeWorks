package driverAndVehicle;

import vineteTask.Vinete;
import vineteTask.truckVinete;

public class Truck extends Vehicle {
	@Override
	public void setVinete(Vinete vinete) {
		if (vinete instanceof truckVinete) {
			super.setVinete(vinete);
		} else {
			//TODO
		}
	}

}
