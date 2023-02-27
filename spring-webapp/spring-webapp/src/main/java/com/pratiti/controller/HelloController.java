package com.pratiti.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping("/hi") //this will be kept in url http://localhost:8080/spring-webapp/hi <- like this
	public String hello(Map<String, String> map) {
		map.put("message", "Welcome to spring mvc");
		return "hello.jsp";
	}
}
