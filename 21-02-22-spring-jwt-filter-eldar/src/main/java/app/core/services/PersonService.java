package app.core.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.core.entities.Person;
import app.core.repos.PersonRepo;

@Service
@Transactional
public class PersonService {
	
	@Autowired
	private PersonRepo personRepo;
	
	public boolean login(String email, String password) {
		return email.equals("admin@mail.com") && password.equals("admin");
	}
	
	public int addPerson(Person person) {
		return this.personRepo.save(person).getId();
	}
	
	public Person getPerson(int personId) {
		return this.personRepo.findById(personId).orElse(null);
	} 
	
	

}
