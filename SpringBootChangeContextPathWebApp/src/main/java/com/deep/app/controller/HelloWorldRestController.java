package com.deep.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Amardeep Kumar
 */

@RestController
public class HelloWorldRestController {
	
	@GetMapping("/")
	public String welcome() {
		return "Hello World !!!";
	}
}
