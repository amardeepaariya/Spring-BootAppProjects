package com.deep.people.management.app.dao;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import com.deep.people.management.app.entities.Person;
/**
 * @author Amardeep Kumar
 */
public interface PeopleManagementDao extends Repository<Person, Integer> {

	List<Person> findByLastName(String lastName, Pageable pageable);
	
	
}
