package app.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import app.core.beans.Person;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		
		Person p1 = ctx.getBean("person", Person.class);
		Person p2 = ctx.getBean("x", Person.class);
		
		p1.setName("Ann");
		
		System.out.println(p1);
		System.out.println(p2);
		
		
	}
	
	@Bean
	public Person x(@Value("${x.name: defaultName}") String name) {
		Person p = new Person();
		p.setId(100);
		p.setName(name);
		return p;
	}

}
