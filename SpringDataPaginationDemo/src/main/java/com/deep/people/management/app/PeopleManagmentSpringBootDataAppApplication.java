package com.deep.people.management.app;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;

import com.deep.people.management.app.entities.Person;
import com.deep.people.management.app.service.PeopleManagementService;


@SpringBootApplication
public class PeopleManagmentSpringBootDataAppApplication implements CommandLineRunner {

	@Autowired
	private PeopleManagementService peopleManagementService;
	
	public static void main(String[] args) {
		SpringApplication.run(PeopleManagmentSpringBootDataAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Person> list = peopleManagementService.findByLastName("Kumar", 
				new PageRequest(0, 4, Direction.ASC , "firstName"));
		
		list.forEach(System.out::println);
		
	}

}
