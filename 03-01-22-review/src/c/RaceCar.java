package c;

public class RaceCar extends Car {
	
	// added attributes
	private boolean turboOn;
	
	// CTOR 1
	public RaceCar() {
		this("RED", 0, 0, true);
	}

	// CTOR 2
	public RaceCar(String color, int speed, int km, boolean turboOn) {
//		super();
		super(color, speed, km);
		this.turboOn = turboOn;
	}

	// methods
	public boolean isTurboOn() {
		return turboOn;
	}

	public void setTurboOn(boolean turboOn) {
		this.turboOn = turboOn;
	}

	@Override
	public String toString() {
		return super.toString() +  " - RaceCar [turboOn=" + turboOn + "]";
	}
	
	
	
	
	
	
	
	
	

}
