package dealers;

import providers.Provider;
import shopingCenters.ShopingCenter;

public abstract class Dealer {
	private String name;
	public String getName() {
		return name;
	}

	private String agress;
	private int capital;
	public int getCapital() {
		return capital;
	}

	protected ShopingCenter[] shopingCenters;
	protected int freePlacesForCenters;
	protected Provider[] providers;
	protected int freePlacesForProviders;
	
	public int getFreePlacesForCenters() {
		return freePlacesForCenters;
	}

	public int getFreePlacesForProviders() {
		return freePlacesForProviders;
	}

	public Dealer(String name, String agress, int capital, int numberOfShopingCenters, int numberOfProviders) {
		this.name = name;
		this.agress = agress;
		this.capital = capital;
		this.shopingCenters = new ShopingCenter[numberOfShopingCenters];
		this.freePlacesForCenters = numberOfShopingCenters;
		this.providers = new Provider[numberOfProviders];
		this.freePlacesForProviders = numberOfProviders;
	}
	
	public abstract void setProvider(Provider provider);
	public abstract void setShopingCenter(ShopingCenter shopingCenter);

	public abstract void orderProducts();

	public abstract void packTurnover();

	public abstract void payTaxs();

}