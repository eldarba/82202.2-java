package app.core;

public class Highway {
	
	public static final int MAX = 100;
	private String name;
	private Car[] cars = new Car[MAX];
	
	public Highway() {
	}

	public Highway(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car[] getCars() {
		return cars;
	}

	public void setCars(Car[] cars) {
		this.cars = cars;
	}

	@Override
	public String toString() {
		return "Highway [name=" + name + "]";
	}
	
	public int getNumberOfCars() {
		int c = 0;
		for (Car car : cars) {
			if(car!=null) {
				c++;
			}
		}
		return c;
	}

}
