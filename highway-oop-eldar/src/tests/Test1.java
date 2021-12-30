package tests;

import app.core.Car;

public class Test1 {

	public static void main(String[] args) {
		
		System.out.println(Car.MIN_SPEED);
		System.out.println(Car.MAX_SPEED);
		
		Car car = new Car();
		boolean x = car.setSpeed(350);
		System.out.println(x);
		System.out.println(car.getSpeed());

	}

}
