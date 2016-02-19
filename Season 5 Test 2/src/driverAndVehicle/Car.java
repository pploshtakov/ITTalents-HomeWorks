package driverAndVehicle;

import vineteTask.Vinete;
import vineteTask.carVinete;

public class Car extends Vehicle {
	@Override
	public void setVinete(Vinete vinete) {
		if (vinete instanceof carVinete) {
			super.setVinete(vinete);
		} else {
			//TODO
		}
	}
}
