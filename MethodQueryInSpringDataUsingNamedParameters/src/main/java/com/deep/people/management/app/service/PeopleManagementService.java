package com.deep.people.management.app.service;

import java.util.List;

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

	public List<Person> findByLastNameOrFirstName(String lastName, String firstName) {
		return peopleManagementDao.findByLastNameOrFirstName(lastName, firstName);
	}

}
