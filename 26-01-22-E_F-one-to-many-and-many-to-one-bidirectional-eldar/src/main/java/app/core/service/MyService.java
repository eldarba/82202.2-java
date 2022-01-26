package app.core.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.core.entities.Student;
import app.core.entities.University;
import app.core.repos.StudentRepo;
import app.core.repos.UniversityRepo;

@Service
@Transactional
public class MyService {

	@Autowired
	private StudentRepo studentRepo;
	@Autowired
	private UniversityRepo universityRepo;

	public void addStudent(Student student) {
		University univ = universityRepo.save(student.getUniversity());
		student.setUniversity(univ);
		studentRepo.save(student);
	}

	public University getUniversity(int id) {
		Optional<University> opt = universityRepo.findById(id);
		if (opt.isPresent()) {
			University univ = opt.get();
			return univ;
		} else {
			return null;
		}
	}

}
