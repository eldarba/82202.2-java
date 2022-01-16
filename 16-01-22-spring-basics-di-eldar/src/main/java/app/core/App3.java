package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import app.core.beans.FamilyCar;

public class App3 {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class)) {
			FamilyCar car = ctx.getBean(FamilyCar.class);
			System.out.println("max speed: " + car.getMaxSpeed());

		}

	}

}
