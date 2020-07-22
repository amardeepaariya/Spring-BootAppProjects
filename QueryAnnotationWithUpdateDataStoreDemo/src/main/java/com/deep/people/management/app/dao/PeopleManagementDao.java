package com.deep.people.management.app.dao;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.deep.people.management.app.entities.Person;

public interface PeopleManagementDao extends Repository<Person, Integer> {

	@Transactional
	@Modifying(clearAutomatically = true)
	@Query(value = "UPDATE Person SET email=:newEmail WHERE id=:personId")
	void updatePersonEmailById(@Param("personId")int id, @Param("newEmail")String newEmail);
	
}
