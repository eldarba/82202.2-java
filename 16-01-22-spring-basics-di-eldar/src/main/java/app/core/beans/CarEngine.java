package app.core.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class CarEngine implements Engine {

	@Override
	public void switchOn() {
		System.out.println("car engine on");

	}

	@Override
	public void switchOff() {
		System.out.println("car engine off");
	}

}
