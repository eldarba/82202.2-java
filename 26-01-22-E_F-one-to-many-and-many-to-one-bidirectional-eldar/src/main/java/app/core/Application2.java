package app.core;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import app.core.entities.Student;
import app.core.entities.University;
import app.core.repos.StudentRepo;
import app.core.repos.UniversityRepo;

@SpringBootApplication
public class Application2 {

	public static void main(String[] args) {

		// spring context
		ApplicationContext ctx = SpringApplication.run(Application2.class, args);

		UniversityRepo universityRepo = ctx.getBean(UniversityRepo.class);
		StudentRepo studentRepo = ctx.getBean(StudentRepo.class);

		Optional<University> opt = universityRepo.findById(1);
		if (opt.isPresent()) {
			University u = opt.get();
			System.out.println(u);
			System.out.println(studentRepo.findByUniversityId(1));

		} else {
			System.out.println("NOT FOUND");
		}

	}

}
