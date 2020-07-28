package com.deep.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author Amardeep Kumar
 */
@RestController
public class HelloWorldController {

	@RequestMapping(value="/welcome",method=RequestMethod.GET)
	public String hello(){
		return "Hello World";
	}
}

