package com.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello-spring-boot")
	public String hello() {
		return "Welcome to Spring Boot and Rest API Development";
	}
}
