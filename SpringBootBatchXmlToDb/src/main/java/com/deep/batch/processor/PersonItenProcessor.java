package com.deep.batch.processor;

import org.springframework.batch.item.ItemProcessor;

import com.deep.batch.model.Person;

public class PersonItenProcessor implements ItemProcessor<Person, Person>{

	@Override
	public Person process(Person person) throws Exception {
		return person;
	}
}