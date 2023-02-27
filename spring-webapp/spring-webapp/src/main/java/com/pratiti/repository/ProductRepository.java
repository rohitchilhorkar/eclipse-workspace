
package com.pratiti.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pratiti.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
	
	public Optional<Product> findByProductName(String productname);
}
