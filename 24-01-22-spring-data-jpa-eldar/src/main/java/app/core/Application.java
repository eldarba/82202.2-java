package app.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import app.core.dao.PersonDao;
import app.core.entities.Person;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);

		PersonDao personDao = ctx.getBean(PersonDao.class);

//		{ // add person 
//			Person person = new Person(102, "bbb", 33);
//			personDao.addPerson(person);
//		}

//		{ // find person
//			Person p = personDao.find(101);
//			System.out.println(p);
//		}

//		{ // delete person
//			personDao.deleteById(101);
//			System.out.println("deleted");
//		}

		{ // update person
			Person p = new Person(102, "newName", 125);
			personDao.updatePerson(p);
		}
	}

}
