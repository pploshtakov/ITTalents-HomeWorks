package driverAndVehicle;

import vineteTask.Vinete;
import vineteTask.busVinete;

public class Bus extends Vehicle {
	@Override
	public void setVinete(Vinete vinete) {
		if (vinete instanceof busVinete) {
			super.setVinete(vinete);
		} else {
			//TODO
		}
	}

}
