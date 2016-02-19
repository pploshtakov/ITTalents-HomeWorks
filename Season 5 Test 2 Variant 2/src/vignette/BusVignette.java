package vignette;

import vehicles.Vehicle;

public class BusVignette extends Vignette {
	public static final int PRICE_FOR_DAY = 9;
	public static final int PRICE_FOR_MONTH = 90;
	public static final int PRICE_FOR_YEAR = 540;

	protected BusVignette(String typeOfVignette, String validity, int price) {
		super(typeOfVignette, validity, price);
	}

}
