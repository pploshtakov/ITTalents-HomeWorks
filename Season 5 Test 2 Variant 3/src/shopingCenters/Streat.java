package shopingCenters;

import java.util.Random;

import randoms.Randoms;

public class Streat extends ShopingCenter {
	public static final int AREA_MAX = 6;
	public static final int AREA_MIN = 4;

	protected Streat(String adress, String workingTime, int area, int tax) {
		super(adress, workingTime, area, tax);
	}
	
	public static Streat createRandomStreat() {
		int area = new Random().nextInt((AREA_MAX - AREA_MIN) + 1) + AREA_MIN;
		return new Streat(Randoms.RandomAdress(), Randoms.RandomWorkTime(), area, ShopingCenter.TAX_STREAT);
	}

}
