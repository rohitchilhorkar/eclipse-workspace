package com.springboot.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Customer_Spring_Table")
public class Customer {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private LocalDate dateOfBirth;
	private String email;
	private String profilePic;
	private String password;
	private Status status;
	
//	mappedBy is used to say that foreign key kahi aur hai
//	Cascade kiya to address ko bhi set kr sakte hai, nahi to use alag se karna padega
	@OneToOne(mappedBy = "customer", cascade = CascadeType.ALL)	
	private Address address;
	
	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}


	public static enum Status{
		ACTIVE, INACTIVE, LOCKED
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProfilePic() {
		return profilePic;
	}

	public void setProfilePic(String profilePic) {
		this.profilePic = profilePic;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	
	public void setPassword(String password) {
		this.password = password;
	}

	

	
}
