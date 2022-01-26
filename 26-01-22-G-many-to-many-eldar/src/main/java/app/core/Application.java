package app.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import app.core.entities.Student;
import app.core.entities.University;
import app.core.repos.UniversityRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		// spring context
		ApplicationContext ctx = SpringApplication.run(Application.class, args);

		Student st1 = new Student(0, "aaa", null);
		Student st2 = new Student(0, "bbb", null);
		Student st3 = new Student(0, "ccc", null);
		Student st4 = new Student(0, "ddd", null);

		University univ1 = new University(0, "Ivrit", "Israel", null);
		University univ2 = new University(0, "Yale", "USA", null);

		univ1.addStudent(st1);
		univ1.addStudent(st2);
		univ2.addStudent(st3);
		univ2.addStudent(st4);

		UniversityRepo universityRepo = ctx.getBean(UniversityRepo.class);
		universityRepo.save(univ1);
		universityRepo.save(univ2);

	}

}
