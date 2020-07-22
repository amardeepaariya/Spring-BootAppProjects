package com.deep.people.management.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import com.deep.people.management.app.entities.Person;

public interface PeopleManagementDao extends Repository<Person, Integer> {
	
	@Query(value = "SELECT p FROM Person p WHERE p.lastName=?1")
	List<Person> getPersonInfoByLastName(String String);
	
	@Query(value = "SELECT p FROM Person p WHERE p.firstName=?1 AND email=?2")
	List<Person> findByFirstNameAndEmail(String firstName, String email);
}
