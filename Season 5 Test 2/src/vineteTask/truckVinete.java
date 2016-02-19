package vineteTask;

public class truckVinete extends Vinete {

	public truckVinete(String dateOfProduction, String validity) {
		super(dateOfProduction, validity);
		this.setColor("red");
		this.setVehicle("truck");
	}

	@Override
	public void setPrice() {
		if (this.getValidity().equalsIgnoreCase("day")) {
			this.price = 9 ;
		} else if(this.getValidity().equalsIgnoreCase("month")) {
			this.price = 90;
		} else if (this.getValidity().equalsIgnoreCase("year")) {
			this.price = 540;
		}
		
	}

}
