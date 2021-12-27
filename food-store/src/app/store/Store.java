package app.store;

public class Store {

	private Fruit[] fruits = new Fruit[100];
	private Vegetable[] vegetables = new Vegetable[100];

	public boolean addFruit(Fruit fruit) {
		for (int i = 0; i < fruits.length; i++) {
			if (fruits[i] == null) {
				fruits[i] = fruit;
				return true;
			}
		}
		return false;
	}

	public boolean addVegetable(Vegetable vegetable) {
		for (int i = 0; i < vegetables.length; i++) {
			if (vegetables[i] == null) {
				vegetables[i] = vegetable;
				return true;
			}
		}
		return false;
	}

	public void showStock() {
		System.out.println("=============================");
		System.out.println("store stock:");
		System.out.println("fruites:");
		for (Fruit fruit : fruits) {
			System.out.println(fruit);
		}
		System.out.println("vegetables:");
		for (Vegetable veg : vegetables) {
			System.out.println(veg);
		}
		System.out.println("=============================");
	}

	public int heaviestApple() {
		int max = 0;
		for (Fruit fruit : fruits) {
			if (fruit instanceof Apple) {
				if (fruit.getWeight() > max) {
					max = fruit.getWeight();
				}
			}
		}
		return max;
	}

	public int heaviestStrawberry() {
		int max = 0;
		for (Fruit fruit : fruits) {
			if (fruit instanceof Strawberry) {
				if (fruit.getWeight() > max) {
					max = fruit.getWeight();
				}
			}
		}
		return max;
	}

	public int heaviestFruit() {
		int a = heaviestApple();
		int b = heaviestStrawberry();
		return a > b ? a : b;
	}

}
