package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import app.core.beans.Vehicle;

public class App2 { 

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class)) {
			Vehicle[] vehicles = new Vehicle[5];
			vehicles[0] = ctx.getBean(Vehicle.class);
//			vehicles[1] = ctx.getBean("boat", Vehicle.class);
			vehicles[2] = ctx.getBean("airplane", Vehicle.class);
//			vehicles[3] = ctx.getBean("raceCar", Vehicle.class);
			vehicles[4] = ctx.getBean(Vehicle.class);
			
			for (Vehicle vehicle : vehicles) {
				if (vehicle==null) {
					continue;
				}
				vehicle.start();
				vehicle.goTo("destination");
				vehicle.stop();
				System.out.println("======");
			}
		}

	}

}
