package app.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.core.entities.Person;

// repositories are like DAO
public interface PersonRepository extends JpaRepository<Person, Integer> {

}
