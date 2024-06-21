package keycloakdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	@GetMapping("/hello")
	public String hello() {
		return "Hello user";
	}

	@GetMapping("/hello-pr")
	public String helloProtected() {
		return "Hello admin";
	}
}
