package vineteTask;

import java.util.Random;

import dateValidator.DateValidator;

public abstract class Vinete {
	private String dateOfProduction;
	// private int day;
	// private int month;
	// private int year;
	private String color;
	private String validity;
	private String vehicle;
	protected double price;
	private static final String BUS_VINETTE = "Bus Vinette";
	private static final String CAR_VINETTE = "Car Vinette";
	private static final String TRUCK_VINETTE = "Truck Vinette";
	private String[] typesOfVinettes = {BUS_VINETTE, CAR_VINETTE, TRUCK_VINETTE};
	private Random randomGenerator;
	public Vinete(String typesOfVinette, String validity) {
		// this.day = day;
		// this.month = month;
		// this.year = year;
		//this.setDateOfProduction(date);
		if (typesOfVinette.equals(BUS_VINETTE)) {
			
		}
		this.setValidity(validity);
	}
	
//	public Vinete randomVinette() {
//		int index = randomGenerator.nextInt(typesOfVinettes.length);
//		
//	}
	
	
	
	public double getPrice() {
		return price;
	}

	public abstract void setPrice();

	private DateValidator dateValidator;

	public void init() {
		dateValidator = new DateValidator();
	}

	// public int getDay() {
	// return day;
	// }

	public void setDateOfProduction(String dateOfProduction) {
		if (dateValidator.isThisDateValid(dateOfProduction, "dd/MM/yyyy")) {
			this.dateOfProduction = dateOfProduction;
		} else {
			System.out.println("Date format must be dd/MM/yyyy! Set date again becouse default set 01/01/2016!");
		}
	}

	// public int getMonth() {
	// return month;
	// }
	// public void setMonth(int month) {
	// this.month = month;
	// }
	// public int getYear() {
	// return year;
	// }
	// public void setYear(int year) {
	// this.year = year;
	// }
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getValidity() {
		return validity;
	}

	public void setValidity(String validity) {
		if (validity.equalsIgnoreCase("day") || validity.equalsIgnoreCase("month")
				|| validity.equalsIgnoreCase("year")) {
			this.validity = validity;
		} else {
			System.out.println("Validity must be day, month or year.Plase set again.");
		}

	}

	public String getVehicle() {
		return vehicle;
	}

	public void setVehicle(String vehicle) {
		if (vehicle.equalsIgnoreCase("car") || vehicle.equalsIgnoreCase("bus") || vehicle.equalsIgnoreCase("truck")) {
			this.vehicle = vehicle;
		} else {
			System.out.println("Please set car, bus or truck.");
		}
	}

	public void stickToGlass() {
		System.out.println("Glued to glass.");
	}
}
