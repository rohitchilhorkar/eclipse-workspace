package com.pratiti.product.app;

import java.time.LocalDate;
import java.util.List;

import com.pratiti.dao.PersonDao;
import com.pratiti.entity.Passport;
import com.pratiti.entity.Person;

public class PersonApp {

	public static void main(String[] args) {
		
	PersonDao dao = new PersonDao();
	Person person = new Person();
	person.setName("Rohit Chilhorkar");
	person.setAge(22);
	dao.add(person);
	
	person = dao.fetchPerson(40);
	Passport passport = new Passport();
	passport.setIssueDate(LocalDate.of(2022, 2, 7));
	passport.setExpiryDate(LocalDate.of(2032, 2, 7));
	
//	Konse person ka passport hai ye?
	passport.setPersonId(person);
	
//	Passport ko update kardo
	dao.Update(passport);
//	
	
	
	
	List<Person> pers = dao.fetchAllPersons();
	for(Person a : pers) {
		System.out.println(a.getName());
		System.out.println(a.getAge());
	}
	}
}
