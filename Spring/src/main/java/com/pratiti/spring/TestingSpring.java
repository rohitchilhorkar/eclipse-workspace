package com.pratiti.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestingSpring {
		
		public static void main(String[] args) {
//			Loading Spring
			ApplicationContext ctx = new ClassPathXmlApplicationContext("springConfig.xml");
//			accessing the Object
			HelloWorld hw = (HelloWorld) ctx.getBean("hello");
			System.out.println(hw.sayHello("Rohit Chilhorkar"));
			
			Calci calc = (Calci)ctx.getBean("calci");
			System.out.println(calc.add(23, 43));
			System.out.println(calc.sub(23, 43));
			
			CurrencyConverter obj = (CurrencyConverter) ctx.getBean("currConv");
			System.out.println(obj.convert("USD","INR",  100));
			
			PrintKey key = (PrintKey) ctx.getBean("PrintKey");
			key.printKeyword("Zingalala Hu Hu Hu");
			
			TextEditor te = (TextEditor) ctx.getBean("textEditor");
			te.load("abc.txt");
		}
	
}
