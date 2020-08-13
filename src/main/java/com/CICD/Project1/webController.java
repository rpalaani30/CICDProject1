package com.CICD.Project1;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class webController {
	
	@RequestMapping("/")
	public String index() {
		return "Greetings from CICD Project1!";
	}
	
	
}
