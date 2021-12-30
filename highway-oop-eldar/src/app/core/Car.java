package app.core;

public class Car {

	private int number;
	private int speed; // [0 - 110]
	public static final int MIN_SPEED = 0;
	public static final int MAX_SPEED = 110;

	public Car() {
	}

	public Car(int number, int speed) {
		super();
		this.number = number;
		setSpeed(speed);
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getSpeed() {
		return speed;
	}

	public boolean setSpeed(int speed) {
		if (speed >= MIN_SPEED && speed <= MAX_SPEED) {
			this.speed = speed;
			return true;
		}else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Car [number=" + number + ", speed=" + speed + "]";
	}
	
	

}
