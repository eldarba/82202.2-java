package app.core.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Airplane implements Vehicle {
	
	static int c; // this is just for generating new numbers
	
	private int number = ++c;
	
	@Autowired
	private Engine airplaneEngine; // qualify by name

	@Override
	public void start() {
		this.airplaneEngine.switchOn();
	}

	@Override
	public void goTo(String destination) {
		System.out.println("going to " + destination);
	}

	@Override
	public void stop() {
		this.airplaneEngine.switchOff();
	}

}
