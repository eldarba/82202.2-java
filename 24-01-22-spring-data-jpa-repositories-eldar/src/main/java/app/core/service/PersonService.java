package app.core.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import app.core.entities.Person;
import app.core.repository.PersonRepository;

@Service
@Transactional
public class PersonService {

	@Autowired
	private PersonRepository personRepository;

	// create
	public int addPerson(Person person) {
		Optional<Person> opt = this.personRepository.findById(person.getId());
		if (opt.isEmpty()) {
			person = this.personRepository.save(person);
			return person.getId();
		} else {
			throw new RuntimeException("add failed - person id " + person.getId() + " already exists");
		}
	}

	// read
	public Person find(int id) {
		Optional<Person> opt = this.personRepository.findById(id);
		if (opt.isPresent()) {
			return opt.get();
		} else {
			throw new RuntimeException("find failed - person id " + id + " not found");
		}
	}

	// update
	public void update(Person person) {
		Optional<Person> opt = this.personRepository.findById(person.getId());
		if (opt.isPresent()) {
			this.personRepository.save(person); // because this entity exist in the database it is updated (not created)
		} else {
			throw new RuntimeException("update failed - person id " + person.getId() + " not found");
		}
	}

	// delete
	public void delete(int id) {
		Optional<Person> opt = this.personRepository.findById(id);
		if (opt.isPresent()) {
			this.personRepository.deleteById(id);
		} else {
			throw new RuntimeException("delete failed - person id " + id + " not found");
		}
	}

}
