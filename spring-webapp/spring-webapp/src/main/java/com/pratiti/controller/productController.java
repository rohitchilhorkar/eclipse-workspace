package com.pratiti.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pratiti.entity.Product;
import com.pratiti.repository.ProductRepository;

@Controller
public class productController {

	@Autowired
	ProductRepository productRepo;
	
	
	@RequestMapping("/add-product")
	public String add(Map<String, Integer> map, Product product) {
		productRepo.save(product);
		
		map.put("id", product.getId());
		return "productadded.jsp";
	}
	
	@RequestMapping("/search-product-by-id")
	public String search(Map<String, Product> map, @RequestParam("id") int id) {
		Product product = productRepo.findById(id).get();
		map.put("p", product);
		return "searchProduct.jsp";
		
	}
	@RequestMapping("/search-product-by-name")
	public String search(Map<String, Product> map, @RequestParam("productName") String name) {
		Product product = productRepo.findByProductName(name).get();
		map.put("p", product);
		return "searchProduct.jsp";
	}
	@RequestMapping("/fetch-all-products")
	public String fetchAll(Map model) {
		
		List<Product> p = productRepo.findAll();
		model.put("allProducts", p);
		return "searchProduct.jsp";
	}
}
