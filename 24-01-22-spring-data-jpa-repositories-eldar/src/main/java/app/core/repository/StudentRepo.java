package app.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.core.entities.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
