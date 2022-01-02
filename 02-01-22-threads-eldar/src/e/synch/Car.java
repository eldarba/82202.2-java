package e.synch;

import java.util.ArrayList;
import java.util.List;

public class Car {

	private int number;
	private int km;
	private List<String> registeredDrivers = new ArrayList<String>();

	public Car(int number) {
		super();
		this.number = number;
	}

	public synchronized void drive(int distance) {
		Thread driver = Thread.currentThread();
		System.out.println("driver " + driver.getName() + " started at " + km + " km. for a distance of " + distance
				+ " with car " + number);
		km += distance;
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("driver " + driver.getName() + " finished at " + km + " km. with car " + number);
	}
	
	public void register() {
		Thread driver = Thread.currentThread();
		registeredDrivers.add(driver.getName());
		System.out.println("\tdriver " + driver.getName() + " registered to car " + number);
	}

}
