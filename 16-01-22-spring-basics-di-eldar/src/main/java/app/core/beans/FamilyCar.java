package app.core.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Primary
public class FamilyCar implements Vehicle {
	
	static int c; // this is just for generating new car numbers
	
	private int number = ++c;
	
	// inject value from properties file - always text or numbers - not objects
	@Value("${car.max.speed: -1}")
	private int maxSpeed;
	
	// this is a dependency - helper class
	// it needs to be injected by the container
	@Autowired
	@Qualifier("carEngine") // qualify with annotation
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

	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	

}
