package app.core;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import app.core.entities.Student;
import app.core.entities.University;
import app.core.repos.StudentRepo;
import app.core.repos.UniversityRepo;
import app.core.service.MyService;

@SpringBootApplication
public class Application6 {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(Application6.class, args);

		UniversityRepo universityRepo = ctx.getBean(UniversityRepo.class);
		StudentRepo studentRepo = ctx.getBean(StudentRepo.class);
		MyService service = ctx.getBean(MyService.class);

		Optional<University> opt = universityRepo.findById(2);
		if (opt.isPresent()) {
			University univIvrit = opt.get();
			System.out.println(univIvrit);
			Student st1 = new Student(0, "Dani", univIvrit);
			Student st2 = new Student(0, "Maya", univIvrit);
			Student st3 = new Student(0, "Yosi", univIvrit);
			Student[] arr = { st1, st2, st3 };
			for (Student student : arr) {
//				service.addStudent(student);
				studentRepo.save(student);
			}
		} else {
			System.out.println("University Not Found");
		}

	}

}
