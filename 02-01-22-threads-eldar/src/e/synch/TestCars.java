package e.synch;

public class TestCars {

	public static void main(String[] args) {
		Car car1 = new Car(101);
//		Car car2 = new Car(102);
		CarDriver dan = new CarDriver("Dan", car1, 200);
		CarDriver lea = new CarDriver("Lea", car1, 70);
		CarDriver yosi = new CarDriver("Yosi", car1, 70);
		CarDriver rivka = new CarDriver("Rivka", car1, 70);
		dan.start();
		lea.start();
		yosi.start();
		rivka.start();

	}

}
