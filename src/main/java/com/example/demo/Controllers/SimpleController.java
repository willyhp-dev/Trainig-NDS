package com.example.demo.Controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
	
	@GetMapping(value = "/")
	public String userNameController() {
		return "welcome";
	}
	@Value("Willy")
	private String YourName;
	
	@GetMapping( value ="/profile")
	public String names() {
		return YourName;
	}

	@Value("${master.role}")
	private String role;

	@GetMapping(value = "/role")
	public String Roles() {
		return "My Role is : " + role;
	}



	}
