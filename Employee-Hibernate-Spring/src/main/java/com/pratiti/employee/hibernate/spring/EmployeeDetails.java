package com.pratiti.employee.hibernate.spring;
import java.util.List;

public interface EmployeeDetails {

	void addNewEmployee(Employee employee);
	public List<Employee> getAllEmployee();
}
