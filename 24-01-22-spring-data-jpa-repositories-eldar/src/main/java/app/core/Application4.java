package app.core;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;

import app.core.entities.Student;
import app.core.repository.StudentRepo;
import app.core.service.StudentService;

@SpringBootApplication
public class Application4 {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(Application4.class, args);

		StudentRepo repo = ctx.getBean(StudentRepo.class);

		List<Student> students = repo.findByActiveIsFalse();

		for (Student student : students) {
			System.out.println(student);
		}
	}

}
