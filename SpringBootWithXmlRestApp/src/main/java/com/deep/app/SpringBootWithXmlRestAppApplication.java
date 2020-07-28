package com.deep.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
/**
 * @author Amardeep Kumar
 */
@SpringBootApplication
@ImportResource("classpath:Beans.xml")
public class SpringBootWithXmlRestAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithXmlRestAppApplication.class, args);
	}
}
