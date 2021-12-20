package d.enums;

import d.enums.Car.Type;

public class TestCar {

	public static void main(String[] args) {
		
		Car car = new Car(111, 0, Color.RED, Type.SPORT);
		
		System.out.println(car);

	}

}
