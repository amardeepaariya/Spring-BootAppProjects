package com.deep.people.management.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.deep.people.management.app.dao.PeopleManagementDao;
import com.deep.people.management.app.entities.Person;

@Service
public class PeopleManagementService {
	
	@Autowired
	private PeopleManagementDao peopleManagementDao;

	public List<Person> findByLastName(String lastName, PageRequest pageRequest) {
		return peopleManagementDao.findByLastName(lastName,pageRequest);
	}

}
