package demo;

import dealers.Dealer;
import dealers.ET;
import dealers.Peddler;
import dealers.Retailer;
import providers.Provider;
import randoms.Randoms;
import shopingCenters.ShopingCenter;

public abstract class Demo {



	public static void main(String[] args) {
		//create 10 random providers
		Provider[] providers = new Provider[10];
		for(int i = 0; i < providers.length; i++) {
			providers[i] = Provider.randomProvider();
		}
		
		//create 20 random shopping centers
		ShopingCenter[] shopingCenters = new ShopingCenter[20];
		for(int i = 0; i < shopingCenters.length; i++) {
			shopingCenters[i] = ShopingCenter.randomShopingCenter();
		}
		
		//create dealers
		Peddler peddler = new Peddler(Randoms.RandomNames("peddler"), Randoms.RandomAdress(), 100);
		ET et = new ET(Randoms.RandomNames("et"), Randoms.RandomAdress(), 500);
		Retailer retailer = new Retailer(Randoms.RandomNames("retailer"), Randoms.RandomAdress(), 3000);
		
		// deal providers and shoping centers on dealers
			//deal providers
		for (int i = 0; i < providers.length; i++) {
			if (peddler.getFreePlacesForProviders() > 0) {
				peddler.setProvider(providers[i]);
			}
			if (et.getFreePlacesForProviders() > 0) {
				et.setProvider(providers[i]);
			}
			if (retailer.getFreePlacesForProviders() > 0) {
				retailer.setProvider(providers[i]);
			}
		}
			//deal shoping centers
		for (int i = 0; i < shopingCenters.length; i++) {
			if (et.getFreePlacesForCenters() > 0) {
				et.setShopingCenter(shopingCenters[i]);
			}
			if (retailer.getFreePlacesForCenters() > 0) {
				retailer.setShopingCenter(shopingCenters[i]);
			}
		}
		//method with list of dealers perform business activities
		Dealer[] dealers = {peddler, et, retailer};
		businessActivities(dealers);
		
		//calculate current cash for all shoping centers
		for(int i = 0; i < shopingCenters.length; i++) {
			shopingCenters[i].getCurrentCash();
		}
		
		//dealer at most sales
		int indexMaxSales = 0;
		for(int i = 1; i < dealers.length; i++) {
			if (dealers[indexMaxSales].getSalesForMonth < dealers[i].getSalesForMonth) {
				indexMaxSales = i;
			}
		}
		System.out.println(dealers[indexMaxSales].getName());

	}
	public static void businessActivities(Dealer[] dealers) {
		for(int i = 0; i < dealers.length; i++) {
			dealers[i].orderProducts();
			dealers[i].packTurnover();
			dealers[i].payTaxs();
		}
	}
}


