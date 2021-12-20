package a.animals;

import interfaces.AdvancedFlyer;

public class Bat extends Mammal implements AdvancedFlyer {

	@Override
	public void speak() {
		System.out.println("squeek");
	}

	@Override
	public void takeOff() {
		System.out.println("take off like a bat");
	}

	@Override
	public void fly() {
		System.out.println("fly like a bat");
	}

	@Override
	public void navigate() {
		System.out.println("navigate like a bat");
	}

	@Override
	public void land() {
		System.out.println("land like a bat");
	}
	
}
