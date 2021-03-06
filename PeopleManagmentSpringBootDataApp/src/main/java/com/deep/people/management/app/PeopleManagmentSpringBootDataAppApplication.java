package com.deep.people.management.app;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.Date;
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
		//createPerson();
		//createPersons();
		//getPersonByIds();
		//deletePersonEntity();
		updatePersonEmailById();
		
	}
	
	private void updatePersonEmailById() {
		peopleManagementService.updatePersonEmailById(7, "rk@gmail.com");
	}

	private void deletePersonEntity() {
		Person person = new Person();
		person.setId(8);
		peopleManagementService.deletePersonEntity(person);
	}

	private void getPersonByIds() {
		List<Integer> ids = new ArrayList<>();
		ids.add(1);
		ids.add(3);
		ids.add(12);
		Iterable<Person> personList = peopleManagementService.getPersonByIds(ids);
		personList.forEach(System.out::println);
	}

	private void createPersons() {
		List<Person> personList = Arrays.asList(new Person("Amardeep", "Kumar", "adk@Gmail.com", 
				new Date()),new Person("Ruchi", "Kumari", "ruchi@gmail.com", new Date()));
		Iterable<Person> createPersons = peopleManagementService.createPersons(personList);
		for (Person person : createPersons) {
			System.out.println(person);
		}
		
	}


	private void createPerson() {
		Person person = new Person("Amardeep", "Kumar", "adkaec@gmail.com", new Date());
		Person personDb = peopleManagementService.createPerson(person);
		System.out.println(personDb);
		
	}

}
