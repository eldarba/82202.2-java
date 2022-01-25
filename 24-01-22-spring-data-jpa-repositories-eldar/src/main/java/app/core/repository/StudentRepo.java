package app.core.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import app.core.entities.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

	// native sql - less recommended
	@Query(value = "select * from students where the_gender='F'", nativeQuery = true)
	List<Student> getFemales();

	// JPQL - a form of sql that is Entity oriented (not table oriented)
	@Query(value = "from Student where gender='M'")
	List<Student> getMales();

	@Query(value = "from Student where gender='M'")
	List<Student> getMales(Sort sort);

}
