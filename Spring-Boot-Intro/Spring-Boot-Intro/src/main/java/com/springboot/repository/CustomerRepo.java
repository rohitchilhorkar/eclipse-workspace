package com.springboot.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

//	@Query("select c from Customer_Table c where email=?1")
//	This is provided by default by JpaRepository, query  ready made milega
	public boolean existsByEmail(String email);
	public Optional<Customer> findByEmail(String email);
	public boolean existsByPassword(String password);
	public Optional<Customer> findById(int id);
//	Fetch : findBy
//	Search : existsBy
}
