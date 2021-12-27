package app.store;

public class Apple extends Fruit {

	public Apple() {
	}

	public Apple(int weight, Taste taste) {
		super(weight, taste);
	}

	@Override
	public String toString() {
		return "Apple [weight=" + getWeight() + ", taste=" + getTaste() + "]";
	}
	
	

}
