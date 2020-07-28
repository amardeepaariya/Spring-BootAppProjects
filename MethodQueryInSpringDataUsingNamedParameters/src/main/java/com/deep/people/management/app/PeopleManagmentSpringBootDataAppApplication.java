package com.deep.people.management.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.deep.people.management.app.entities.Person;
import com.deep.people.management.app.service.PeopleManagementService;

/**
 * @author Amardeep Kumar
 */

@SpringBootApplication
public class PeopleManagmentSpringBootDataAppApplication implements CommandLineRunner {

	@Autowired
	private PeopleManagementService peopleManagementService;
	
	public static void main(String[] args) {
		SpringApplication.run(PeopleManagmentSpringBootDataAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Person> list = peopleManagementService.findByLastNameOrFirstName("Kumar", "Amardeep");
		list.forEach(System.out::println);
	}

}
