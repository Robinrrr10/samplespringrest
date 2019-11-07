package com.github.samplespringrest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/api")
	public String checking() {
		return "Hello world";
	}

}
