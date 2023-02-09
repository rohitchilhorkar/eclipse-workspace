package com.pratiti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.pratiti.entity.Address;
import com.pratiti.entity.Customer;
import com.pratiti.entity.Product;

public class CustomerAddressDao {

	public void add(Customer customer) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate_introduction");
		EntityManager em = emf.createEntityManager();
//		Must write for TCL, for security purpose
		em.getTransaction().begin();
		em.persist(customer); //persist will generate insert query
		em.getTransaction().commit();
		emf.close();
	}
	
	public void add(Address address) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate_introduction");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(address); //persist will generate insert query
		em.getTransaction().commit();
		emf.close();
	}
	public Customer fetchCustomer(int id) {
		
		EntityManagerFactory emf = null;
		try {
			emf = Persistence.createEntityManagerFactory("hibernate_introduction");
			EntityManager em = emf.createEntityManager();
			Customer customer = em.find(Customer.class, id);
			return customer;
		}
		finally {
			emf.close();
		}
	}
	public Address fetchAddress(int id) {
		
		EntityManagerFactory emf = null;
		try {
			emf = Persistence.createEntityManagerFactory("hibernate_introduction");
			EntityManager em = emf.createEntityManager();
			Address address = em.find(Address.class, id);
			return address;
		}
		finally {
			emf.close();
		}
	}
	public List<Customer> fetchAllCustomers(){		
		
		EntityManagerFactory emf = null;
		try {
			emf = Persistence.createEntityManagerFactory("hibernate_introduction");
			EntityManager em = emf.createEntityManager();
			Query q = em.createQuery("select p from Customer p"); //hibernate query language/java persistence ql
			List<Customer> list = q.getResultList();
			return list;
		}
		finally {
			emf.close();
		} 		
	}
	public void Update(Customer customer) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate_introduction");
		EntityManager em = emf.createEntityManager();
//		Must write for TCL, for security purpose
		em.getTransaction().begin();
		
		em.merge(customer); //persist will generate insert query
		
		em.getTransaction().commit();
		emf.close();
	}
	public List<Address> fetchAllAddress(){		
		
		EntityManagerFactory emf = null;
		try {
			emf = Persistence.createEntityManagerFactory("hibernate_introduction");
			EntityManager em = emf.createEntityManager();
			Query q = em.createQuery("select p from Address p"); //hibernate query language/java persistence ql
			List<Address> list = q.getResultList();
			return list;
		}
		finally {
			emf.close();
		} 		
	}
	
	public List<Customer> fetchCustomerByCity(String cityName){
	
		EntityManagerFactory emf = null;
		try {
			emf = Persistence.createEntityManagerFactory("hibernate_introduction");
			EntityManager em = emf.createEntityManager();
//			Yaha pr class ka naam hai, Hum refer customer class ke address vale object ko refer kar rahee hai!
//			Address class ka jo object hai humare pass use dena hai
			Query q = em.createQuery("Select c from Customer c join c.address a where a.city = :cityName");
			q.setParameter("cityName", cityName);
			List<Customer> list = q.getResultList();
			return list;
		}
		finally {
			emf.close();
		} 		
	}
	public List<Object[]> fetchMultipleParameter(){	

		EntityManagerFactory emf = null;
		try {
			emf = Persistence.createEntityManagerFactory("hibernate_introduction");
			EntityManager em = emf.createEntityManager();
			Query q = em.createQuery("Select c.name, c.dateOfBirth, a.city from Customer c join c.address a");	
			List<Object[]> list = q.getResultList();
			return list;
		}
		finally {
			emf.close();
		}
	}
}





















