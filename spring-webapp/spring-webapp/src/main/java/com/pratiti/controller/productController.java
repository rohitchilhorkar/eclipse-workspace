package com.pratiti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pratiti.entity.Product;
import com.pratiti.repository.ProductRepository;

@Controller
public class productController {

	@Autowired
	ProductRepository productRepo;
	
	@RequestMapping("/add-product")
	public String add(Product product) {
		productRepo.save(product);
		return "productadded.jsp";
	}
}
