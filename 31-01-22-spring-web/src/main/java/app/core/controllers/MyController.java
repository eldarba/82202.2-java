package app.core.controllers;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	// when we map an endpoint we define:
	// 1. http method
	// 2. path
	// http://localhost:8080/hello
	@RequestMapping(method = RequestMethod.GET, path = { "/hello", "/y", "/z" })
	public String hello() {
		return "today is: " + LocalDateTime.now();
	}

	// random number method
	@RequestMapping(method = RequestMethod.GET, path = "/random")
	public int random() {
		return (int) (Math.random() * 101);
	}

	// http://localhost:8080/sum?a=5&b=100
	@RequestMapping(method = RequestMethod.GET, path = "/sum")
	public int sum(@RequestParam int a, @RequestParam int b) {
		return a + b;
	}

	// http://localhost:8080/sum2?a=5&b=100
	@RequestMapping(method = RequestMethod.GET, path = "/sum2")
	public String sum2(@RequestParam int a, @RequestParam int b) {
		return a + " + " + b + " = " + (a + b); // result is transfered by tomcat to client through http
	}

}
