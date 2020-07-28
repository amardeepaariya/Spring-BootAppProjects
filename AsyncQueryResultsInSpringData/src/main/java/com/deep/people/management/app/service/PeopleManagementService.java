package com.deep.people.management.app.service;

import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deep.people.management.app.dao.PeopleManagementDao;
import com.deep.people.management.app.entities.Person;

/**
 * @author Amardeep Kumar
 */

@Service
public class PeopleManagementService {
	
	@Autowired
	private PeopleManagementDao peopleManagementDao;

	public CompletableFuture<Person> findByEmail(String email) {
		return peopleManagementDao.findByEmail(email);
	}


}
