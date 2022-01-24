package app.core;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import app.core.entities.Student;
import app.core.entities.Student.Gender;
import app.core.service.StudentService;

@SpringBootApplication
public class Application3 {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application3.class, args);

		StudentService service = ctx.getBean(StudentService.class);
		Student student = new Student(0, "CCC", 22, "ccc@mail", Gender.F, LocalDate.of(2020, 1, 1), false);

		service.addStudent(student);

	}

}
