package com.deep.people.management.app.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;
/**
 * @author Amardeep Kumar
 */
@Entity
@Table(name = "person_table")
@DynamicUpdate
@NamedNativeQueries(value = {
		@NamedNativeQuery(name = "Person.getPersonInfoByLastName", query = "SELECT * FROM person_table WHERE last_name=?1", resultClass = Person.class),
		@NamedNativeQuery(name = "Person.findByFirstNameAndEmail", query = "SELECT * FROM person_table WHERE first_name=?1 AND email=?2", resultClass = Person.class)
		})
public class Person {
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "person_id")
	private int id;
	
	@Column(name = "first_name", length = 60, nullable = false)
	private String firstName;
	
	@Column(name = "last_name", length = 60, nullable = false)
	private String lastName;
	
	@Column(name = "email", unique = true)
	private String email;
	
	@Column(name = "creation_date")
	private Date creationDsate;
	
	
	public Person(String firstName, String lastName, String email, Date creationDsate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.creationDsate = creationDsate;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getCreationDsate() {
		return creationDsate;
	}
	public void setCreationDsate(Date creationDsate) {
		this.creationDsate = creationDsate;
	}


	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", creationDsate=" + creationDsate + "]";
	}


}
