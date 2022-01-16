package app.core.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Boat implements Vehicle {
	
	static int c; // this is just for generating new numbers
	
	private int number = ++c;
	
	@Autowired
	@Qualifier("boatEngine")
	private Engine engine;

	@Override
	public void start() {
		this.engine.switchOn();
	}

	@Override
	public void goTo(String destination) {
		System.out.println("going to " + destination);
	}

	@Override
	public void stop() {
		this.engine.switchOff();
	}

}
