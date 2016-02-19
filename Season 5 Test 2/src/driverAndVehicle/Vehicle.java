package driverAndVehicle;

import vineteTask.Vinete;

public abstract class Vehicle {
	private String model;
	private Vinete vinete;
	private int year;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		if (model != null) {
			this.model = model;
		} else {
			System.out.println("Plase set a model!");
		}
	}
	public Vinete getVinete() {
		return vinete;
	}
	public void setVinete(Vinete vinete) {
		this.vinete = vinete;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		//TODO local date
		if (year > 1960) {
			this.year = year;
		} else {
			System.out.println("Plase set year, or use default - 1960!");
			this.year = 1960;
		}
	}
	

}
