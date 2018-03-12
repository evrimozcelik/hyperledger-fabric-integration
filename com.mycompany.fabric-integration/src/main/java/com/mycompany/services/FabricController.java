package com.mycompany.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FabricController {
	
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}

}
