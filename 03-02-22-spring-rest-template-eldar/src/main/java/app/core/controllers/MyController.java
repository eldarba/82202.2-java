package app.core.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// http://localhost:8080
@RestController
@RequestMapping("/api")
public class MyController {
	
	private List<String> names = new ArrayList<>();
	
	@GetMapping("/greet")
	public String greet() {
		return "hello from server";
	} 
	
	// api/add-name
	@PostMapping("/add-name")
	public void addName(@RequestBody String name) {
		names.add(name);
		System.out.println(names);
	}
	
	@GetMapping("/find-name/{index}")
	public String findName(@PathVariable int index) {
		if(index >= names.size() || index < 0) {
			return "NO SUCH INDEX";
		}else {
			return names.get(index);
		}
	}

}
