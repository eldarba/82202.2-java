package app.core.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import app.core.jwt.util.JwtUtil;
import app.core.jwt.util.JwtUtil.ClientDetails;

@RestController
public class MyController {
	
	@Autowired
	private JwtUtil jwtUtil;
	
	@PutMapping("/register")
	public String register(@RequestBody ClientDetails clientDetails) {
		return this.jwtUtil.generateToken(clientDetails);
	}
	
	@GetMapping("/greet")
	public String greet(@RequestHeader String token) {
		try {
			ClientDetails clientDetails = this.jwtUtil.extractClient(token);
			return "Hello " + clientDetails;
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "invalid token: " + e.getMessage());
		}
	}

}
