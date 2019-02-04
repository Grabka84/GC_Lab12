package gc_lab12;

import java.text.DecimalFormat;

public class UsedCar extends Car {
	private double mileage;

	// constructors
	public UsedCar() {}
	
	public UsedCar(String make, String model, int year, double price, double mileage) {
		setMake(make);
		setModel(model);
		setYear(year);
		setPrice(price);
		setMileage(mileage);
	}
	
	// getters and setters for new subclass
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	
	public double getMileage() {
		return mileage;
	}
	
	@Override
	public String toString() {
		DecimalFormat ft = new DecimalFormat("$###,###.##");
		return (getMake() + "\t" + getModel() + "\t" + getYear() + "\t" + ft.format(getPrice()) + "\t" + "(USED)\t" + getMileage()+ " miles");	
		// couldn't get the return to give me a formatted string with printf, couldn't store the printf to something and then return that
	}
	
}
