package c;

public class Vehicle {
	
	// attributes
	private String color;
	private int speed;
	
	// CTOR 1
	public Vehicle() {
	}

	// CTOR 2
	public Vehicle(String color, int speed) {
		super();
		this.color = color;
		this.speed = speed;
	}
	
	// methods

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Vehicle [color=" + color + ", speed=" + speed + "]";
	}
	
	
	
	

}
