package app.store.main;

import app.store.Apple;
import app.store.Carrot;
import app.store.Food.Taste;
import app.store.Fruit;
import app.store.Store;
import app.store.Strawberry;
import app.store.Tomato;
import app.store.Vegetable;

public class StoreStatistics {

	public static void main(String[] args) {

		Store basta = new Store();
		fillStore(basta);
		basta.showStock();
		
		System.out.println("haviest apple in store: " + basta.heaviestApple());
		System.out.println("haviest strawbery in store: " + basta.heaviestStrawberry());
		System.out.println("haviest fruit in store: " + basta.heaviestFruit());

	}

	public static void fillStore(Store store) {
		boolean notfull = true; // fruits
		while (notfull) {
			notfull = store.addFruit(getRandomFruit());
		}

		notfull = true; // vegetables
		while (notfull) {
			notfull = store.addVegetable(getRandomVeg());
		}

	}

	public static Fruit getRandomFruit() {
		Taste taste = Taste.values()[(int) (Math.random() * Taste.values().length)];
		if (Math.random() < 0.5) {
			int weight = (int) (Math.random() * 101) + 200; // 200 - 300
			return new Apple(weight, taste);
		} else {
			int weight = (int) (Math.random() * 101) + 100; // 100 - 200
			return new Strawberry(weight, taste);
		}
	}

	public static Vegetable getRandomVeg() {
		Taste taste = Taste.values()[(int) (Math.random() * Taste.values().length)];
		if (Math.random() < 0.5) {
			int weight = (int) (Math.random() * 101) + 200; // 200 - 300
			return new Carrot(weight, taste);
		} else {
			int weight = (int) (Math.random() * 101) + 100; // 100 - 200
			return new Tomato(weight, taste);
		}
	}

}
