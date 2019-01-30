package gc_lab12;

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
	public String getMake(String make) {
		return make;
	}
	
	public String getModel(String model) {
		return model;
	}
	
	public int getYear(int year) {
		return year;
	}
	
	public double getPrice(double price) {
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
		return ("The car is a " + year + " " + make + " " + model + " with a list price of " + price);				
	}
	
}
