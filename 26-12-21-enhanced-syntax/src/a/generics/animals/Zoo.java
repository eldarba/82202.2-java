package a.generics.animals;

import java.util.List;

// when defining the class - set the parameters
public class Zoo<T1 extends Animal , T2 extends Animal, T3 extends Animal> {
	
	private List<T1> zone1;
	private List<T2> zone2;
	private List<T3> zone3;
	
	public void addToZone1(T1 animal) {
		zone1.add(animal);
	}
	public void addToZone2(T2 animal) {
		zone2.add(animal);
	}
	public void addToZone3(T3 animal) {
		zone3.add(animal);
	}
	
// when creating the objects - set the type arguments - the actual types
	public static void main(String[] args) {
		Zoo<Mammal, Mammal, Animal> zoo1 = new Zoo<>();
		Zoo<Bird, Mammal, Dog> zoo2 = new Zoo<>();
		
		
	}

}
