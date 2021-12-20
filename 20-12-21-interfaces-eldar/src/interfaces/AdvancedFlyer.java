package interfaces;

import interfaces.Flyer;
import interfaces.Navigator;

public interface AdvancedFlyer extends Flyer, Navigator {

	void takeOff();

	void land();
}
