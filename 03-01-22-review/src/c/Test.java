package c;

public class Test {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Vehicle();
		Car car = new Car();
		RaceCar raceCar = new RaceCar();
		
		System.out.println(vehicle);
		System.out.println(car);
		System.out.println(raceCar);
		
		System.out.println("================");
		
		printVehicleColor(vehicle);
		printVehicleColor(car);
		printVehicleColor(raceCar);
		

	}
	
	public static void printVehicleColor(Vehicle v) {
		System.out.println("vehicle color is: " + v.getColor());
	}

}
