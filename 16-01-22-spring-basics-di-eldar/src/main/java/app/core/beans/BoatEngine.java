package app.core.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BoatEngine implements Engine {

	@Override
	public void switchOn() {
		System.out.println("boat engine on");
		
	}

	@Override
	public void switchOff() {
		System.out.println("boat engine off");
	}

}
