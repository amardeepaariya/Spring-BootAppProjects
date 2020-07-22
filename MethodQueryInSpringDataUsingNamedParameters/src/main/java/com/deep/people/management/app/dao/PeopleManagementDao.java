package com.deep.people.management.app.dao;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import com.deep.people.management.app.entities.Person;

public interface PeopleManagementDao extends Repository<Person, Integer> {

	@Query("SELECT p FROM Person p WHERE p.firstName=:firstname OR p.lastName=:lastname")
	List<Person> findByLastNameOrFirstName(@Param("lastname")String lastName, @Param("firstname")String firstName);

	}
