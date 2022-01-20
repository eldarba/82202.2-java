package app.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import app.core.beans.Person;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		
		Person p1 = ctx.getBean(Person.class);
		Person p2 = ctx.getBean(Person.class);
		
		p1.setName("Ann");
		p2.setName("Dan");
		
		System.out.println(p1);
		System.out.println(p2);
		
		
	}

}
