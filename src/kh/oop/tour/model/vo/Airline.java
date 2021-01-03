package kh.oop.tour.model.vo;

public class Airline {
	String country; 
	int mileage;
	int airfare;
	
	public Airline() {}
	
	public Airline(String country, int mileage, int airfare) {
		this.country=country;
		this.mileage=mileage;
		this.airfare=airfare;
	}
	
	public String getCountry() {
		return country;
	}
	
	public int getMileage() {
		return mileage;
	}
	
	public int getAirfare() {
		return airfare;
	}
	
	public void setCountry(String country) {
		this.country=country;
	}
	
	public void setMileage(int mileage) {
		this.mileage=mileage;
	}
	
	public void setAirfare(int airfare) {
		this.airfare=airfare;
	}
	
	
}
