package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import app.core.beans.Person;

public class App {

	public static void main(String[] args) {
		
		// create spring container
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		
		// ask the container for beans
		Person p1 = ctx.getBean(Person.class);
		p1.setName("Dani");
		
		Person p2 = ctx.getBean(Person.class);
		p2.setName("Lea");

		Person p3 = ctx.getBean(Person.class);
		p3.setName("Zehava");

		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		ctx.close();

	}

}
