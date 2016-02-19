package shopingCenters;

import java.util.Random;

import randoms.Randoms;

public class Mall extends ShopingCenter {
	public static final int AREA_MAX = 100;
	public static final int AREA_MIN = 10;

	protected Mall(String adress, String workingTime, int area, int tax) {
		super(adress, workingTime, area, tax);
	}
	
	public static Mall createRandomMall() {
		int area = new Random().nextInt((AREA_MAX - AREA_MIN) + 1) + AREA_MIN;
		return new Mall(Randoms.RandomAdress(), Randoms.RandomWorkTime(), area, ShopingCenter.TAX_MALL);
	}

}
