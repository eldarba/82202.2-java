package app.core;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;

import app.core.entities.Student;
import app.core.service.StudentService;

@SpringBootApplication
public class Application3 {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application3.class, args);

		StudentService service = ctx.getBean(StudentService.class);

		String[] names = { "Dan", "Ran", "Lea", "Hanna", "Moshe", "David" };

//		for (int i = 0; i < 10; i++) {
//			Student student = new Student(0, null, 0, "abc@mail", null, LocalDate.of(2020, 1, 1), false);
//			student.setName(names[(int) (Math.random() * names.length)]);
//			student.setAge((int) (Math.random() * 100));
//			student.setGender(Math.random() < 0.5 ? Gender.M : Gender.F);
//			student.setActive(Math.random() < 0.5 ? true : false);
//			service.addStudent(student);
//		}

//		List<Student> femaleStudents = service.getFemaleStudents();
//		for (Student student : femaleStudents) {
//			System.out.println(student);
//		}
//
//		System.out.println("==================");
//		List<Student> maleStudents = service.getMaleStudents(Sort.by("age")); // asc - default
////		List<Student> maleStudents = service.getMaleStudents(Sort.by(Direction.ASC, "age")); // default
////		List<Student> maleStudents = service.getMaleStudents(Sort.by(Direction.DESC, "age")); // desc
//		for (Student student : maleStudents) {
//			System.out.println(student);
//		}

		List<Student> students = service.getStudentsOlderThan(80);
		for (Student student : students) {
			System.out.println(student);
		}
	}

}
