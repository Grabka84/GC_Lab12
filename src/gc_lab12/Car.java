package gc_lab12;

import java.text.DecimalFormat;

public class Car {

	// fields in class Car
	private String make;
	private String model;
	private int year;
	private double price;
	
	
	// constructors for all fields
	public Car() {}
		
	public Car(String make, String model) {
		setMake(make);
		setModel(model);
	}
	
	public Car(String make, String model, int year) {
		setMake(make);
		setModel(model);
		setYear(year);
	}
	
	public Car(String make, String model, int year, double price) {
		setMake(make);
		setModel(model);
		setYear(year);
		setPrice(price);
	}
	
	// getters for all fields
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getYear() {
		return year;
	}
	
	public double getPrice() {
		return price;
	}
	
	// setters for all fields
	public void setMake(String make) {
		this.make = make;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void setPrice(double price) {
		this.price = price;	
	}
	
	@Override
	public String toString() {
		DecimalFormat ft = new DecimalFormat("$###,###.##");
		return (make + "\t" + model + "\t" + year + "\t" + ft.format(price));	
		// couldn't get the return to give me a formatted string with printf, couldn't store the printf to something and then return that
	}
	
}
