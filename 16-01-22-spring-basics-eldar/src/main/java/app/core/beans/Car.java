package app.core.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("theCar") // @Component means the instances of this class are managed by spring container
@Scope("prototype") // prototype means we have many instances
public class Car {

	private int number;
	private int speed;
	private String color;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [number=" + number + ", speed=" + speed + ", color=" + color + "]";
	}

}
