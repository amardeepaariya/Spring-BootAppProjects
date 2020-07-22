package com.deep.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"package com.deep.controller"})
public class SpringBootWhitelabelErrorMessageDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWhitelabelErrorMessageDemoApplication.class, args);
	}

}
