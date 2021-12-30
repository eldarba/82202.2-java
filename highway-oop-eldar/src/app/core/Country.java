package app.core;

public class Country {

	public static final int MAX = 5;
	private Highway[] highways = new Highway[MAX];

	public Highway[] getHighways() {
		return highways;
	}

	public void setHighways(Highway[] highways) {
		this.highways = highways;
	}

	public int getNumberOfCars() {
		int c = 0;
		for (Highway highway : highways) {
			if (highway != null) {
				c += highway.getNumberOfCars();
			}
		}
		return c;
	}

}
