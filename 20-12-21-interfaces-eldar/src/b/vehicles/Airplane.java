package b.vehicles;

import interfaces.Flyer;

public class Airplane implements Flyer {

	@Override
	public void fly() {
		System.out.println("fly like an airplane");
	}

}
