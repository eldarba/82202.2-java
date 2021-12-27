package app.store;

public class Strawberry extends Fruit {

	public Strawberry() {
	}

	public Strawberry(int weight, Taste taste) {
		super(weight, taste);
	}

	@Override
	public String toString() {
		return "Strawbery [weight=" + getWeight() + ", taste=" + getTaste() + "]";
	}
	
	

}
