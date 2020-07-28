package com.deep.app.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author Amardeep Kumar
 */
@RestController
public class MyController {

	@Value(value="${welcome.message}")
	private String message;
	
	@GetMapping("/")
	public String hello(){
		return message;
	}
}
