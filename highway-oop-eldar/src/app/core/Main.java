package app.core;

public class Main {

	// this is a static field
	// it is initialized on class load
	private static int nextCarNumber = 1;
	private static int highwayNumber = 101;

	public static void main(String[] args) {
		Country country = getRandomCountry();
		System.out.println("number of cars in country: " + country.getNumberOfCars());
		
		System.out.println("number of cars on each highway:");
		for (Highway h : country.getHighways()) {
			if (h != null) {
				System.out.println(h.getName() + " number of cars: " + h.getNumberOfCars());
			}
		}
	}

	public static Country getRandomCountry() {
		Country country = new Country();
		int numberOfHighways = (int) (Math.random() * 4) + 2;
		for (int i = 0; i < numberOfHighways; i++) {
			country.getHighways()[i] = getRandomHighway();
		}
		return country;
	}

	public static Highway getRandomHighway() {
		Highway highway = new Highway();
		highway.setName("H-" + highwayNumber++);
		int numberOfCars = (int) (Math.random() * Highway.MAX + 1);
		for (int i = 0; i < numberOfCars; i++) {
			highway.getCars()[i] = getRandomCar();
		}
		return highway;
	}

	public static Car getRandomCar() {
		int number = nextCarNumber++;
		int speed = (int) (Math.random() * Car.MAX_SPEED + 1);
		Car car; // declaration
		if (Math.random() < 0.8) {
			car = new FamilyCar(number, speed);
		} else {
			car = new SportsCar(number, speed);
		}
		return car;
	}

}
