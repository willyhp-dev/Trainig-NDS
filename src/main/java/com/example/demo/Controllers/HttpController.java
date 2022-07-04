package com.example.demo.Controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/world")
public class HttpController {


	@Value("user")
	private String name;
	
	@Value("${master.user.name}")
	private String userName;

	@GetMapping(value = "/username")
	public String userNameController() {
		return userName;
	}

	@GetMapping(value = "/user")
	public String UserController() {
		return name;
	}
	
	@GetMapping(value = "/hello")
	public String HelloController() {
		return "Hello";
	}
}
