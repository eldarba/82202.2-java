package app.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import app.core.entities.Person;
import app.core.repository.PersonRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);

		PersonRepository repo = ctx.getBean(PersonRepository.class);

		Person p1 = new Person(0, "Dan", 22);
		Person p2 = new Person(0, "Lea", 33);

		repo.save(p1);
		repo.save(p2);

	}

}
