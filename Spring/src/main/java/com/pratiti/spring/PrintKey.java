package com.pratiti.spring;

import org.springframework.stereotype.Component;

@Component("PrintKey")
public class PrintKey {

	public void printKeyword(String keyword) {
		System.out.println(keyword);
	}
}
