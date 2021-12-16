package d;

public class Talker extends Person {

	@Override
	public void speak() {
		for (int i = 0; i < 3; i++) {
			super.speak();
		}
	}
}
