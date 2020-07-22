package com.deep.app;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootChangeServerPortWebAppApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringBootChangeServerPortWebAppApplication.class, args);
		
		SpringApplication springApplication = new SpringApplication(SpringBootChangeServerPortWebAppApplication.class);
		
		//setPort(springApplication);
		
		springApplication.run(args);
	}

	private static void setPort(SpringApplication springApplication) {
		Map<String, Object> configMap = new HashMap<>();
		configMap.put("SERVER_PORT", 8585);
		
		springApplication.setDefaultProperties(configMap);
	}

}
