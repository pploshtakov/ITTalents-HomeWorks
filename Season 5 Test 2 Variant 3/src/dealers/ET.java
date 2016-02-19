package dealers;

import providers.Provider;
import shopingCenters.Market;
import shopingCenters.ShopingCenter;
import shopingCenters.Streat;

public class ET extends Dealer {

	public ET(String name, String agress, int capital) {
		super(name, agress, capital, 1, 5);
	}

	@Override
	public void setProvider(Provider provider) {
		if (provider.getType().equals(Provider.TYPE_RETAIL) && this.freePlacesForProviders > 0) {
			this.providers[this.providers.length - this.freePlacesForProviders] = provider;
		} else {
			System.out.println("ET only works retail providers and onli five!");
		}
	}

	@Override
	public void setShopingCenter(ShopingCenter shopingCenter) {
		if ((shopingCenter instanceof Market || shopingCenter instanceof Streat) && this.freePlacesForCenters > 0) {
			this.shopingCenters[this.shopingCenters.length - this.freePlacesForCenters] = shopingCenter;
		} else {
			System.out.println("ET only works markets or streats and only one!");
		}
	}

	@Override
	public void orderProducts() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void packTurnover() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void payTaxs() {
		// TODO Auto-generated method stub
		
	}

}
