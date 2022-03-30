package com.springsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public String login() {
		return "WElCOME";
	}
	
	
	@GetMapping("/home")
	public String home() {
		return "Home Page!!!";
	}
	
	@GetMapping("/User")
	public String user() {
		return "Welcome User!!!";
	}
	
	@GetMapping("/admin")
	public String hello() {
		return "Welcome Admin!!!";
	}
}
