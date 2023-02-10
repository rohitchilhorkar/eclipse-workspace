package com.pratiti.spring.with.database.mysql;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestingCarParts {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springConfig.xml");
		CarPart cpobj = new CarPart(); 
		cpobj.setPartName("Tyre");
		cpobj.setCarModel("Hero CBZ");
		cpobj.setPrice(2000);
		cpobj.setQuantity(4);
//		CarPart cpobj = new CarPart("Side Mirror", "XUV 500", 1000, 2); 
//		CarPart cpobj = new CarPart("Side Mirror", "XUV 500", 1000, 2); 
//		CarPart cpobj = new CarPart("Side Mirror", "XUV 500", 1000, 2);
		
		CarPartsInventory cpinv = (CarPartsInventory) ctx.getBean("cpInv1");
		cpinv.addNewPart(cpobj);
	}
}
