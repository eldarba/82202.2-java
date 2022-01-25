package app.core.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import app.core.entities.Student;
import app.core.repository.StudentRepo;

@Service
@Transactional
public class StudentService {

	@Autowired
	private StudentRepo studentRepo;

	// create
	public int addStudent(Student student) {
		Optional<Student> opt = this.studentRepo.findById(student.getId());
		if (opt.isEmpty()) {
			student = this.studentRepo.save(student);
			return student.getId();
		} else {
			throw new RuntimeException("add failed - student id " + student.getId() + " already exists");
		}
	}

	// read
	public Student find(int id) {
		Optional<Student> opt = this.studentRepo.findById(id);
		if (opt.isPresent()) {
			return opt.get();
		} else {
			throw new RuntimeException("find failed - student id " + id + " not found");
		}
	}

	// update
	public void update(Student student) {
		Optional<Student> opt = this.studentRepo.findById(student.getId());
		if (opt.isPresent()) {
			this.studentRepo.save(student); // because this entity exist in the database it is updated (not created)
		} else {
			throw new RuntimeException("update failed - student id " + student.getId() + " not found");
		}
	}

	// delete
	public void delete(int id) {
		Optional<Student> opt = this.studentRepo.findById(id);
		if (opt.isPresent()) {
			this.studentRepo.deleteById(id);
		} else {
			throw new RuntimeException("delete failed - student id " + id + " not found");
		}
	}

	public List<Student> getFemaleStudents() {
		return this.studentRepo.getFemales();
	}

	public List<Student> getMaleStudents() {
		return this.studentRepo.getMales();
	}

	public List<Student> getMaleStudents(Sort sort) {
		return this.studentRepo.getMales(sort);
	}

	public List<Student> getStudentsOlderThan(int age) {
		return this.studentRepo.getOlderThan(age);
	}

	public List<Student> getStudentsByName(String name) {
		// System.out.println("****************** the implementing class: " +
		// this.studentRepo.getClass());
		return this.studentRepo.findByName(name);
	}

}
