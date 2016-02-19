package shopingCenters;

import java.util.Random;

import randoms.Randoms;

public class Market extends ShopingCenter {
	public static final int AREA_MAX = 10;
	public static final int AREA_MIN = 2;
	protected Market(String adress, String workingTime, int area, int tax) {
		super(adress, workingTime, area, tax);
	}
	
	public static Market createRandomMarket() {
		int area = new Random().nextInt((AREA_MAX - AREA_MIN) + 1) + AREA_MIN;
		return new Market(Randoms.RandomAdress(), Randoms.RandomWorkTime(), area, ShopingCenter.TAX_MARKET);
	}

}
