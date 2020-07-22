package com.deep.people.management.app.dao;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.deep.people.management.app.entities.Person;

public interface PeopleManagementDao extends Repository<Person, Integer> {
	List<Person> getPersonInfoByLastName(String String);
	List<Person> findByFirstNameAndEmail(String firstName, String email);
}