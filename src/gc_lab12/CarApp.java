package gc_lab12;

import java.util.ArrayList;
import java.util.Scanner;


public class CarApp {

	static Scanner scnr = new Scanner(System.in); // user input through console
	static int numCars; // when entering number of cars, want to use that variable in other methods without having to pass it in and out
	static ArrayList<Car> carList = new ArrayList<Car>(); // array list that will hold the list of cars
	
	public static void main(String[] args) {
		displayHeader();
		createInventory();
		displayMenu(scnr);
		
	}

	private static void displayMenu(Scanner scnr) {
		numCars = Validator.getInt(scnr, "How many cars are you entering: ");
		System.out.println("You have chosen to input " + numCars + " cars.");
		createCarList(scnr, numCars);
		displayCarList(carList);
	}

	private static void displayHeader() {
		System.out.println("Welcome to the Grabka Motors admin console!");
		System.out.println("Here you will have the option to store data about your fleet of sweet, sweet rides.");
	}
	
	private static void createCarList(Scanner scnr, int numCars){
		// local variables in the method, set fields, and set objects to the array 
		String make, model; int year; double price; 
		for (int i = 1; i <= numCars; i++) {
			make = Validator.getString(scnr, "Enter Car #" + i + " Make: ");
			model = Validator.getString(scnr, "Enter Car #" + i + " Model: ");
			year = Validator.getInt(scnr, "Enter Car #" + i + " Year: ");
			price = Validator.getDouble(scnr, "Enter Car #" + i + " Price: ");
			carList.add(new Car(make, model, year, price)); // save the car using the declared variables to the array list
		}
	}
	
	private static void displayCarList(ArrayList<Car> carList) {
		System.out.println("\nCurrent Inventory:");
		System.out.println("Make\tModel\tYear\tPrice");
		for(Car car : carList) {
			System.out.println(car);
		}
	}
	
	// pre-populate list of cars
	public static void createInventory() {
		carList.add(new Car("Nissan", "Altima", 2019, 27000));
		carList.add(new Car("Honda", "Civic", 2019, 25000));
		carList.add(new Car("Ford", "Focus", 2019, 28000));
		carList.add(new UsedCar("Nissan", "Altima", 2015, 18000, 40000));
		carList.add(new UsedCar("Honda", "Civic", 2014, 15000, 27000));
		carList.add(new UsedCar("Ford", "Focus", 2012, 10000, 70000));
		
	}
}
