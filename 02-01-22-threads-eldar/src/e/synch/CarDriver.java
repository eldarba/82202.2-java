package e.synch;

public class CarDriver extends Thread {
	
	private Car car;
	private int travelDistance;
	
	public CarDriver(String name, Car car, int travelDistance) {
		super(name);
		this.car = car;
		this.travelDistance = travelDistance;
	}
	
	@Override
	public void run() {
		car.register();
		car.drive(travelDistance);
	}

}
