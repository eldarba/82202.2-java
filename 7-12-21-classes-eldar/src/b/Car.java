package b;

public class Car {

	// 0 - 90
	private int speed;

	// add get and set methods

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int newSpeed) {
		if (newSpeed >= 0 && newSpeed <= 90) {
			speed = newSpeed;
		}
	}

}
