package app.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import app.core.entities.Student;
import app.core.entities.University;
import app.core.repos.StudentRepo;
import app.core.repos.UniversityRepo;

@SpringBootApplication
public class Application5 {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(Application5.class, args);

		UniversityRepo universityRepo = ctx.getBean(UniversityRepo.class);
		StudentRepo studentRepo = ctx.getBean(StudentRepo.class);

		University univIvrit = new University(0, "Ivrit", "Israel");
		University univYale = new University(0, "Yale", "USA");

		Student st1 = new Student(0, "Dani", univIvrit);
		Student st2 = new Student(0, "John", univYale);

		studentRepo.save(st1);
		studentRepo.save(st2);

	}

}
