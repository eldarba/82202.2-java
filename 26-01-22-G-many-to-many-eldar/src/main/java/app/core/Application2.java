package app.core;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

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

		int univId = 1;

		Optional<University> opt = universityRepo.findById(univId);
		if (opt.isPresent()) {
			University u = opt.get();
			System.out.println(u);
			System.out.println(studentRepo.findByUniversityId(univId));

		} else {
			System.out.println("NOT FOUND");
		}

//		MyService service = ctx.getBean(MyService.class);
//		University u = service.getUniversity(1);
//		System.out.println(u);

	}

}
