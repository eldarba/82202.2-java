package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import app.core.beans.Car;

public class App {

	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);){
			// ask for beans
			Car car1 =  ctx.getBean("numberedCar", Car.class);
			Car car2 =  ctx.getBean("numberedCar", Car.class);
			// print
			System.out.println(car1);
			System.out.println(car2);
			
			
		}
		

	}

}
