package com.pratiti.spring.with.database.mysql;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestingCarParts {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springConfig.xml");
		CarPart cpobj = new CarPart(); 
		
//		Entity Class objects are not created using Spring
		//For Inserting the Objects
//		cpobj.setPartName("Tyre");
//		cpobj.setCarModel("Hero CBZ");
//		cpobj.setPrice(2000);
//		cpobj.setQuantity(4);
//		
		CarPartsInventory cpinv = (CarPartsInventory) ctx.getBean("cpInv4");
		cpinv.addNewPart(cpobj);
		List<CarPart> list = cpinv.getAvailableParts();
		
		for(CarPart ele : list) {
			System.out.println(ele.getPartName());
		}
		((AbstractApplicationContext) ctx).close();
	}
}
