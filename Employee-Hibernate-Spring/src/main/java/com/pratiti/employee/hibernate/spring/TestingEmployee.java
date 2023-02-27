package com.pratiti.employee.hibernate.spring;

import java.time.LocalDate;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestingEmployee {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("EmployeeConfig.xml");
		
//		Employee emp = new Employee();
//		emp.setEmpName("Vaishnavi Shivanand Swami");
//		emp.setAge(22);
//		emp.setDateOfJoining(LocalDate.of(2022, 1, 03));
		
		EmployeeDetails empdao = (EmployeeDetails)ctx.getBean("dao");
		empdao.addNewEmployee(emp);
		
		List<Employee> l = empdao.getAllEmployee();
		for(Employee emi : l)
			System.out.println(emi.getEmpName());
	}
}
