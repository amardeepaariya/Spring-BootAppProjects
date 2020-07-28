package com.deep.people.management.app.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deep.people.management.app.dao.PeopleManagementDao;

/**
 * @author Amardeep Kumar
 */

@Service
public class PeopleManagementService {
	
	@Autowired
	private PeopleManagementDao peopleManagementDao;

	public void updatePersonEmailById(int id, String newEmail) {
		peopleManagementDao.updatePersonEmailById(id, newEmail);
		
	}

}
