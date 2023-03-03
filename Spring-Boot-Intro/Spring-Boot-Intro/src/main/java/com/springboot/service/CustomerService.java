package com.springboot.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springboot.entity.Customer;
import com.springboot.entity.Customer.Status;
import com.springboot.exception.CustomerServiceException;
import com.springboot.model.LoginData;
import com.springboot.repository.AddressRepo;
import com.springboot.repository.CustomerRepo;

@Service
public class CustomerService {
	
//	we inject the class dependencies through spring bean configuration file.
	@Autowired
	private CustomerRepo customerRepo;
	
	@Autowired
	private AddressRepo addressRepo;
	
	public int register(Customer customer) {
		
//		We can use try catch here, but our motive is to pass this message to the client, try catch will stop the code 
//		here only.
		if(!customerRepo.existsByEmail(customer.getEmail())) {
			customerRepo.save(customer);
//			to set whose address is this!
			customer.getAddress().setCustomer(customer);
			
			customer.setStatus(Status.INACTIVE);
			return customer.getId();
		}
		else {
			throw new CustomerServiceException("Customer already Exists..!");
//			throw new Error() is good for throwing a specified error.
		}
		
	}
	
	public void activate(int id) {		

//		Optional is written in order to make sure that we don't get:
//				- NULLpointerException
//				- to use isPresent() method
		Optional<Customer>customerData = customerRepo.findById(id);
		if(customerData.isPresent()) {
			Customer cust = customerData.get();
				if(cust.getStatus()!=Status.LOCKED) {
					cust.setStatus(Status.ACTIVE);
					customerRepo.save(cust);
				}
				else
					throw new CustomerServiceException("Account is locked, please contact to admin!");
		}
		else
			throw new CustomerServiceException("Account is not registeres with us..!");		
	}
	
	public Customer login(String email, String password) {
		
		Optional<Customer> customerData = customerRepo.findByEmail(email);
		if(customerData.isPresent()) {
			Customer customer = customerData.get();
		
			if(customer.getStatus()!=Status.LOCKED) {
				if(customer.getStatus()!=Status.INACTIVE) {
					if(customerRepo.existsByEmail(email) && customerRepo.existsByPassword(password))
					{
						return customer;
					}
					else{
						throw new CustomerServiceException("Enter Correct Password");
					}
				}
				else 
					throw new CustomerServiceException("Your Account is not active..");
			}
			}
			else 
				throw new CustomerServiceException("Your Account is Locked..!");
		return null;
		}	

	public Customer ViewDetails(int id) {		
		return customerRepo.findById(id).get();		
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		

		





















