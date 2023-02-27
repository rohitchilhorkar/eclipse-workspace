package com.pratiti.employee.hibernate.spring;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component("dao")
public class EmployeeDao implements EmployeeDetails{

	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	public void addNewEmployee(Employee employee) {
		em.persist(employee);
	}

	@SuppressWarnings("unchecked")
	public List<Employee> getAllEmployee() {
		Query q = em.createQuery("Select e from Employee e");
		return q.getResultList();		
	}
}
