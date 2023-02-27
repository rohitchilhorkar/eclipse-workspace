package com.pratiti.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pratiti.entity.Customer;
import com.pratiti.repository.CustomerRepository;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerRepository customerRepo;
	
	@RequestMapping("/add-customer")
	public String add(Customer customer) {
		customerRepo.save(customer);
		return "confirmation.jsp";
	}

}
