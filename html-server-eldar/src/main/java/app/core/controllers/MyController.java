package app.core.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import app.core.beans.User;

@RestController
@RequestMapping("/api/users")
public class MyController {
	
	private List<User> users = new ArrayList<>();

	@GetMapping("/find-user")
	public String find(@RequestParam String name) {
		int index = users.indexOf(new User(name, null, 0));
		if(index != -1) {
			return users.get(index).toString();
		}else {
			return "not found";
		}
	}
	
	@PostMapping("/add-user")
	public String add(@RequestParam String name, @RequestParam String address, @RequestParam int age) {
		User user = new User(name, address, age);
		users.add(user);
		return "Added: " + user;
	}
	
	

}
