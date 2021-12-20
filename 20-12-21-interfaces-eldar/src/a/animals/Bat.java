package a.animals;

public class Bat extends Mammal implements Flyer {

	@Override
	public void speak() {
		System.out.println("squeek");
	}

	@Override
	public void fly() {
		System.out.println("fly like a bat");
	}

}
