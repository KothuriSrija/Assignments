package com.springsecurity;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	@GetMapping("/login")
	public String login(Model model,String error,String logout) {
		
		if(error !=null) {
			model.addAttribute("Username and Password Invalid");
		}
		
		if(logout != null) {
			model.addAttribute("Successfully LOGOUT!");
		}
		
		return "login";
	}
	
}
