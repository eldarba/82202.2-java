package c;

import a.animals.Animal;
import a.animals.Bat;
import a.animals.Butterfly;
import a.animals.Mammal;
import b.vehicles.Airplane;
import interfaces.Flyer;

public class Test1 {
	public static void main(String[] args) {
		Animal[] animals; // all animals
		Mammal[] mammals; // only mammals
		
		Flyer[] flyers = new Flyer[3]; // all flyers
		flyers[0] = new Butterfly();
		flyers[1] = new Bat();
		flyers[2] = new Airplane();
		
		for (Flyer flyer : flyers) {
			flyer.fly();
		}
	}

}
