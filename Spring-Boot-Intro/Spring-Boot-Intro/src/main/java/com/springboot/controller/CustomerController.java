package com.springboot.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.springboot.entity.Customer;
import com.springboot.exception.CustomerServiceException;
import com.springboot.model.ActivationStatus;
import com.springboot.model.CustomerData;
import com.springboot.model.LoginData;
import com.springboot.model.LoginStatus;
import com.springboot.model.RegistrationStatus;
import com.springboot.repository.CustomerRepo;
import com.springboot.service.CustomerService;

import ch.qos.logback.core.joran.util.beans.BeanUtil;

@RestController
@CrossOrigin //To avoid errors even if request to access comes from multiple servers
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/register")
	public RegistrationStatus register(CustomerData customerData) {
		
		System.out.println(customerData.getProfilePic().getOriginalFilename());
		RegistrationStatus status = new RegistrationStatus();
		try {
//			We are returning a JSON/Object one and the same file here
			Customer customer = new Customer();
//			Copies all the properties.
			BeanUtils.copyProperties(customerData, customer);
			
//			Copying the uploaded image inside a folder
			String pathName = "S:\\";
			InputStream f1 = customerData.getProfilePic().getInputStream();
			FileOutputStream f2 = new FileOutputStream(pathName + customerData.getProfilePic().getOriginalFilename());
			FileCopyUtils.copy(f1, f2);
			customer.setProfilePic(customerData.getProfilePic().getOriginalFilename());
			int id =customerService.register(customer);
			status.setMessageIfAny("Customer Registered Successfully..!");
			status.setRegisteredCustomerId(id);
			status.setStatus(true);
//			return "Customer Registered Successfully..!";
		}
		catch(IOException | CustomerServiceException e) {
//			return e.getMessage();
			status.setMessageIfAny(e.getMessage());
			status.setStatus(false);
		}
		return status;
	}
	
//	@PostMapping("/register")
//	public RegistrationStatus register(@RequestBody Customer customer) {
//		RegistrationStatus status = new RegistrationStatus();
//		try {
////			We are returning a JSON/Object one and the same file here
//			int id =customerService.register(customer);
//			status.setMessageIfAny("Customer Registered Successfully..!");
//			status.setRegisteredCustomerId(id);
//			status.setStatus(true);
////			return "Customer Registered Successfully..!";
//		}
//		catch(CustomerServiceException e) {
////			return e.getMessage();
//			status.setMessageIfAny(e.getMessage());
//			status.setStatus(false);
//		}
//		return status;
//	}
	
	@GetMapping("/activate-account")
	public ActivationStatus activate(@RequestParam("id") int id) {
		ActivationStatus activateAccount = new ActivationStatus();
		
		try {
			customerService.activate(id);
			activateAccount.setStatus(true);
			activateAccount.setMessage("Account Activated Succesfully!");
		}catch(CustomerServiceException e) {
			e.getMessage();
			activateAccount.setStatus(false);
			activateAccount.setMessage("Account Not Activated :(");			
		}
		return activateAccount;	
	}
	
	@PostMapping("/login")
	public LoginStatus login(@RequestBody LoginData LoginData){
		LoginStatus status = new LoginStatus();
		try {
			Customer customer = customerService.login(LoginData.getEmail(), LoginData.getPassword());
			status.setStatus(true);
			status.setName(customer.getName());
			status.setMessage("Hurrey!, You logged in successfully!");
			status.setId(customer.getId());			
		}catch(CustomerServiceException e) {
			
			status.setStatus(false);
			status.setMessage(e.getMessage());
		}
				
			return status;
			
	}
	
	@GetMapping("/view-details")
	public Customer viewDetails(@RequestParam("id") int id) {
		return customerService.ViewDetails(id);
	}
	
}



























