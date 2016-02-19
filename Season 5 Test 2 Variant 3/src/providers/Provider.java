package providers;

import java.util.Random;

import randoms.Randoms;

public class Provider {
	public static final String TYPE_RETAIL = "ritail provider";
	public static final String TYPE_WHOLESALE = "wholesale provider";
	public static final String[] TYPE_PROVIDERS = { TYPE_RETAIL, TYPE_WHOLESALE };
	
	private String type;
	public String getType() {
		return type;
	}

	private String name;
	private String adress;
	private String workTime;
	private int discount;

	private Provider(String type,String name, String adress, String workTime) {
		this.name = name;
		this.adress = adress;
		this.workTime = workTime;
		if (type.equals(TYPE_WHOLESALE)) {
			this.discount = 15;
		}
		this.discount = 0;
	}

	public static Provider randomProvider() {
		String type = TYPE_PROVIDERS[new Random().nextInt(TYPE_PROVIDERS.length)];
		String name = Randoms.RandomNames("provider");
		String adress = Randoms.RandomAdress();
		String workTime = Randoms.RandomWorkTime();
		
		return new Provider(type, name, adress, workTime);
	}

}
