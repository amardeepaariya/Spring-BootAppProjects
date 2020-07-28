package com.deep.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Amardeep Kumar
 */

@RestController
public class HelloWorldController {
	
	@RequestMapping("/")
	public String hello() {
		return "Hello World!!!";
	}

}
