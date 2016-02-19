package vehicles;

import java.util.Random;

import vignette.Vignette;

public abstract class Vehicle {
	public static final String[] TYPE_OF_VIHECLES = { "Bus", "Car", "Truck" };
	public static final String TYPE_BUS = "Bus";
	public static final String TYPE_CAR = "Car";
	public static final String TYPE_TRUCK = "Truck";
	private String type;
	private Vignette vignette;

	public String getType() {
		return type;
	}

	protected Vehicle(String type) {
		this.type = type;
	}

	public Vignette getVignette() {
		return vignette;
	}

	public void setVignette(Vignette vignette) {
		if (vignette != null) {
			this.vignette = vignette;
		}
	}

	// auto generate vehicle
	public static Vehicle autoGenerateVehicle() {
		if ((TYPE_OF_VIHECLES[new Random().nextInt(TYPE_OF_VIHECLES.length)]).equals("Car")) {
			return new Car(Vehicle.TYPE_CAR);
		} else if ((TYPE_OF_VIHECLES[new Random().nextInt(TYPE_OF_VIHECLES.length)]).equals("Bus")) {
			return new Bus(Vehicle.TYPE_BUS);
		} // else if ((TYPE_OF_VIHECLES[new
			// Random().nextInt(TYPE_OF_VIHECLES.length)]).equals("Truck")){
		return new Truck(Vehicle.TYPE_TRUCK);
		// }
	}

}