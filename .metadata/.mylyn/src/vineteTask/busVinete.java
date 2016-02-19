package vineteTask;

public class busVinete extends Vinete {

	public busVinete(String dateOfProduction, String validity) {
		super(dateOfProduction, validity);
		this.setColor("blue");
		this.setVehicle("bus");
		
		
		
		
	}

	@Override
	public void setPrice() {
		if (this.getValidity().equalsIgnoreCase("day")) {
			this.price = 7 ;
		} else if(this.getValidity().equalsIgnoreCase("month")) {
			this.price = 70;
		} else if (this.getValidity().equalsIgnoreCase("year")) {
			this.price = 420;
		}
	}

}
