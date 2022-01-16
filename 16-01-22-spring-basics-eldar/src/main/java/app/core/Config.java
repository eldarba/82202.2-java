package app.core;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import app.core.beans.Car;

@Configuration
@ComponentScan // scans classes in base package
public class Config {

	private static int c = 101;

	@Bean("numberedCar") // a bean method is another bean definition (the first one was @Componet)
	@Scope("prototype")
	public Car numberedCar() {
		Car car = new Car();
		car.setNumber(c);
		c++;
		return car;
	}

	@Bean
	@Scope("prototype")
	public Integer randomInt() {
		int r = (int) (Math.random() * 101);
		return r;
	}
	
	@Bean
	public String str1() {
		return "Hello Spring Beans 1";
	}
	
	@Bean
	@Lazy
	public String str2() {
		System.out.println("str2 activated by container");
		return "Hello Spring Beans 2";
	}
	
	@Bean
	public LocalDate date() {
		return LocalDate.now();
	}

}
