package shopingCenters;

import java.util.Random;

import dealers.Dealer;

public abstract class ShopingCenter {
	public static final String TYPE_MARKET = "market";
	public static final String TYPE_MALL = "mall";
	public static final String TYPE_STREAT = "streat";
	public static final int TAX_MALL = 150;
	public static final int TAX_MARKET = 50;
	public static final int TAX_STREAT = 50;
	private static final String[] TYPE_SHOPING_CENTERS = { TYPE_MALL, TYPE_MARKET, TYPE_STREAT };

	private String adress;
	private String workingTime;
	private int area;
	private int tax;
	private Dealer dealer;
	private int currentCash;
	public int getCurrentCash() {
		return currentCash;
	}

	private int sales;

	public Dealer getDealer() {
		return dealer;
	}

	public void setDealer(Dealer dealer) {
		if (this.dealer == null) {
			this.dealer = dealer;
		} else {
			System.out.println("This site already has an owner!");
		}
	}

	protected ShopingCenter(String adress, String workingTime, int area, int tax) {
		this.adress = adress;
		this.workingTime = workingTime;
		this.area = area;
		this.tax = tax;
	}

	public static ShopingCenter randomShopingCenter() {
		String type = TYPE_SHOPING_CENTERS[new Random().nextInt(TYPE_SHOPING_CENTERS.length)];
		if (type.equals(TYPE_MALL)) {
			return Mall.createRandomMall();
		} else if (type.equals(TYPE_MARKET)) {
			return Market.createRandomMarket();
		} else {
			return Streat.createRandomStreat();
		}
	}

}
