package c;

public class Car extends Vehicle {
	
	// added attributes
	private int km;
	
	// CTOR 1
	public Car() {
		this("BLACK", 0, 0);
	}

	// CTOR 2
	public Car(String color, int speed, int km) {
		super(color, speed);
		this.km = km;
	}

	// methods
	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	@Override
	public String toString() {
		return super.toString() +  " - Car [km=" + km + "]";
	}
	
	
	
	
	

}
