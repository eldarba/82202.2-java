package app.core.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import app.core.jwt.util.JwtUtil;
import app.core.jwt.util.JwtUtil.ClientDetails;
import app.core.jwt.util.JwtUtil.ClientDetails.ClientType;
import app.core.services.PersonService;

@RestController
public class LoginController {

	@Autowired
	private PersonService personService;
	@Autowired
	private JwtUtil jwtUtil;
	
	@PutMapping
	public String login(@RequestParam String email, @RequestParam String password) {
		if(this.personService.login(email, password)) {
			// generate token and return
			ClientDetails client = new ClientDetails(email, ClientType.ADMIN, 0);
			return jwtUtil.generateToken(client);
		}else {
			throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "bad credentials");
		}
	}
	
}
