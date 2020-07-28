package com.deep.people.management.app.dao;

import java.util.concurrent.CompletableFuture;

import org.springframework.data.repository.Repository;
import org.springframework.scheduling.annotation.Async;

import com.deep.people.management.app.entities.Person;

/**
 * @author Amardeep Kumar
 */

public interface PeopleManagementDao extends Repository<Person, Integer> {

	@Async
	CompletableFuture<Person> findByEmail(String email);
	
	}
