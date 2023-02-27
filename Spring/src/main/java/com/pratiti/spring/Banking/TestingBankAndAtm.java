package com.pratiti.spring.Banking;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestingBankAndAtm {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springConfig.xml");
		Atm machine = (Atm)ctx.getBean("hdfcAtm");
		machine.withdraw(2222, 2000);
	}
}
