package com.deep.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping(value="/welcome")
	public String hello(){
		return "Hello Amardeep Kumar!!";
	}
}
