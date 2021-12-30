package app.core;

public class SportsCar extends Car {

	public SportsCar() {
		super();
	}

	public SportsCar(int number, int speed) {
		super(number, speed);
	}

	@Override
	public String toString() {
		return "SportsCar [number=" + getNumber() + ", speed=" + getSpeed() + "]";
	}
	
	

}
