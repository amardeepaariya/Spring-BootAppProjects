package com.deep.people.management.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.deep.people.management.app.entities.Person;

/**
 * @author Amardeep Kumar
 */

public interface PeopleManagementDao extends CrudRepository<Person, Integer> {

}
