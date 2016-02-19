package vignette;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

import vehicles.Vehicle;

public abstract class Vignette {
	private static final String VALIDITY_DAY = "day";
	private static final String VALIDITY_MONTH = "month";
	private static final String VALIDITY_YEAR = "year";
	public static final String[] VALIDITY = { VALIDITY_DAY, VALIDITY_MONTH, VALIDITY_YEAR };
	public static final String[] PURPOSE_VIGNETTE = { Vehicle.TYPE_BUS, Vehicle.TYPE_CAR, Vehicle.TYPE_TRUCK };
	private String validity;
	private String type;
	private int price;
	private Date dateOfIssue;

	public Date getDateOfIssue() {
		return dateOfIssue;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	private Date expiryDate;

	Date date = new Date();
	Calendar cal = Calendar.getInstance();

	protected Vignette(String typeOfVignette, String validity, int price) {
		this.validity = validity;
		this.setType(typeOfVignette);
		this.price = price;
	}

	public static Vignette randomVignette() {
		if ((PURPOSE_VIGNETTE[new Random().nextInt(PURPOSE_VIGNETTE.length)]).equals(Vehicle.TYPE_CAR)) {
			String validity = VALIDITY[new Random().nextInt(VALIDITY.length)];
			if (validity.equals(VALIDITY_DAY)) {
				return new CarVignette(Vehicle.TYPE_CAR, validity, CarVignette.PRICE_FOR_DAY);
			} else if (validity.equals(VALIDITY_MONTH)) {
				return new CarVignette(Vehicle.TYPE_CAR, validity, CarVignette.PRICE_FOR_MONTH);
			}
			return new CarVignette(Vehicle.TYPE_CAR, validity, CarVignette.PRICE_FOR_YEAR);
			// return new CarVignette(Vehicle.TYPE_CAR, (VALIDITY[new
			// Random().nextInt(VALIDITY.length)]));
		} else if ((PURPOSE_VIGNETTE[new Random().nextInt(PURPOSE_VIGNETTE.length)]).equals(Vehicle.TYPE_BUS)) {
			String validity = VALIDITY[new Random().nextInt(VALIDITY.length)];
			if (validity.equals(VALIDITY_DAY)) {
				return new BusVignette(Vehicle.TYPE_BUS, validity, BusVignette.PRICE_FOR_DAY);
			} else if (validity.equals(VALIDITY_MONTH)) {
				return new BusVignette(Vehicle.TYPE_BUS, validity, BusVignette.PRICE_FOR_MONTH);
			}
			return new BusVignette(Vehicle.TYPE_BUS, validity, BusVignette.PRICE_FOR_YEAR);
			// return new BusVignette(Vehicle.TYPE_BUS, (VALIDITY[new
			// Random().nextInt(VALIDITY.length)]));
		}
		String validity = VALIDITY[new Random().nextInt(VALIDITY.length)];
		if (validity.equals(VALIDITY_DAY)) {
			return new TruckVignette(Vehicle.TYPE_TRUCK, validity, TruckVignette.PRICE_FOR_DAY);
		} else if (validity.equals(VALIDITY_MONTH)) {
			return new TruckVignette(Vehicle.TYPE_TRUCK, validity, TruckVignette.PRICE_FOR_MONTH);
		}
		return new TruckVignette(Vehicle.TYPE_TRUCK, validity, TruckVignette.PRICE_FOR_YEAR);
		// return new TruckVignette(Vehicle.TYPE_TRUCK, (VALIDITY[new
		// Random().nextInt(VALIDITY.length)]));

	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}

	public void setDateOfIssueAndExpiry() {
		cal.setTime(date);
		this.dateOfIssue = date;
		if (this.validity.equals(VALIDITY_YEAR)) {
			cal.add(Calendar.YEAR, 1);
		} else if (this.validity.equals(VALIDITY_MONTH)) {
			cal.add(Calendar.MONTH, 1);
		} else {
			cal.add(Calendar.HOUR, 24);
		}
		this.expiryDate = cal.getTime();
	}

	public String getValidity() {
		return this.validity;
	}
	
	//print info for vignettte
	public void printInfo() {
		System.out.println(this.type + "," + this.validity + "," + this.price);
	}
}
