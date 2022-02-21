package app.core.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import app.core.entities.Person;
import app.core.services.PersonService;

@RestController
@RequestMapping("/api")
public class PersonController {

	@Autowired
	private PersonService personService;
	
	@PostMapping
	public int addPerson(@RequestBody Person person, @RequestHeader String token) {
		return this.personService.addPerson(person);
	}
	
	@GetMapping
	public Person getPerson(@RequestParam int personId, @RequestHeader String token) {
		return this.personService.getPerson(personId);
	}
}
