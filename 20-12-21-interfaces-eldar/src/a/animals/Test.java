package a.animals;

import interfaces.AdvancedFlyer;
import interfaces.Flyer;
import interfaces.Navigator;

public class Test {

	public static void main(String[] args) {
		Animal[] animals = new Animal[10];
		animals[0] = new Ant();
		animals[1] = new Bat();
		animals[2] = new Butterfly();
		animals[3] = new Dog();
		animals[4] = new Cat();
		animals[5] = new Butterfly();
		animals[6] = new Bat();
		animals[7] = new Ostrich();
		animals[8] = new Butterfly();
		animals[9] = new Sparrow();
		
		// for-each loop: on each iteration we get a reference to the next element
		for(Animal animal: animals) {
			if(animal != null) {
				System.out.println(animal.getClass().getSimpleName());
				animal.speak();
				if(animal instanceof AdvancedFlyer) {
					AdvancedFlyer af = (AdvancedFlyer) animal;
					af.takeOff();
					af.fly();
					af.navigate();
					af.land();
				}else {
					if(animal instanceof Flyer) {
						Flyer f = (Flyer) animal;
						f.fly();
					}
					if(animal instanceof Navigator) {
						Navigator n = (Navigator) animal;
						n.navigate();
					}
				}
			}else {
				System.out.println("--- EMPTY");
			}
			System.out.println("==============");
		}
	}

}
