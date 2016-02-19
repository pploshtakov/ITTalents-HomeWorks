package demo;

import java.util.Random;

import driver.Driver;
import gasStation.GasStation;
import vehicles.Vehicle;
import vignette.BusVignette;

public class Demo {

	public static void main(String[] args) {
		// auto generate vignette in new gas station
		// print on screen???
		GasStation gasStation = new GasStation();
		// auto generate drivers
		Driver[] drivers = new Driver[20];
		Random random = new Random();
		for (int i = 0; i < drivers.length; i++) {
			drivers[i] = new Driver((Driver.randomName()), (random.nextInt(10000)), gasStation);
		}
		// auto generate vehicles
		Vehicle[] vehicles = new Vehicle[200];
		for (int i = 0; i < vehicles.length; i++) {
			vehicles[i] = Vehicle.autoGenerateVehicle();
		}
		// allocate vehicles
		int cauntVehicle = 0;
		for (int i = 0; i < drivers.length; i++) {
			while (drivers[i].freePlacesForVehicle > 0) {
				drivers[i].setVehicle(vehicles[cauntVehicle]);
				cauntVehicle++;
			}
		}
		// bay random vignettes from gasStation
		for (int i = 0; i < drivers.length; i++) {
			if (i % 3 == 0) {
				for (int k = 0; k < 5; k++) {
					drivers[i].buyVignetteForRandomVihecles();
				}
			} else {
				drivers[i].buyVignetteForAllVihecles();
			}
		}

		// print info for driver's vehicle
		// print info for vignettes
		// print info for driver's money
		for (int i = 0; i < drivers.length; i++) {
			if (drivers[i] != null) {
				drivers[i].printInfoForDriver();
			}
			System.out.println("-----------------");
		}

		// print info for vignettes in gas station
		// gasStation.printInfoForVignettes();

		// print To bring out all trucks that have expired vignettes for a date
		for (int i = 0; i < drivers.length; i++) {
			drivers[i].getTruckWithExpiresVignette("23/01/2016");
		}

		// FOR PRINT ALL VIGNETTES UNCOMENT
		// gasStation.printInfoForVignettes();
	}

}