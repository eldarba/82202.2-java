package a.animals;

import interfaces.Navigator;

public class Ant extends Insect implements Navigator {

	@Override
	public void speak() {
		System.out.println("speaks like an ant");
	}

	@Override
	public void navigate() {
		System.out.println("nvigate like an ant");
	}

}
