package vineteTask;

public class carVinete extends Vinete {

	public carVinete(String dateOfProduction, String validity) {
		super(dateOfProduction, validity);
		this.setColor("grean");
		this.setVehicle("car");
	}

	@Override
	public void setPrice() {
		if (this.getValidity().equalsIgnoreCase("day")) {
			this.price = 5 ;
		} else if(this.getValidity().equalsIgnoreCase("month")) {
			this.price = 50;
		} else if (this.getValidity().equalsIgnoreCase("year")) {
			this.price = 300;
		}
		
	}

}
