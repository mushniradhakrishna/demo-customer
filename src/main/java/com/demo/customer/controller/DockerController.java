package com.demo.customer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
	
	@GetMapping("/message")
	public String getMessage() {
		return "Hello Customer";
	}

}
