package app.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import app.core.entities.Person;
import app.core.service.PersonService;

@SpringBootApplication
public class Application2 {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application2.class, args);

		PersonService service = ctx.getBean(PersonService.class);

		Person p1 = new Person(2, "AAA", 22);
		Person p2 = new Person(3, "BBB", 33);

		service.addPerson(p1);
		service.addPerson(p2);

	}

}
