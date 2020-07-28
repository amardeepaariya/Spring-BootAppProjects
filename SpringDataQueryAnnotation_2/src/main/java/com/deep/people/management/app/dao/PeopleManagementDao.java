package com.deep.people.management.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import com.deep.people.management.app.entities.Person;
/**
 * @author Amardeep Kumar
 */
public interface PeopleManagementDao extends Repository<Person, Integer> {
	
	@Query(value = "SELECT * FROM person_table WHERE last_name=?1", nativeQuery = true)
	List<Person> getPersonInfoByLastName(String String);
	
	@Query(value = "SELECT * FROM person_table WHERE first_name=?1 AND email=?2", nativeQuery = true)
	List<Person> findByFirstNameAndEmail(String firstName, String email);
}
