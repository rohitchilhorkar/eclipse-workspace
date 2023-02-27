package com.pratiti.App;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pratiti.component.CarPart;
import com.pratiti.component.CarsPartsInventory;

public class App {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("my-spring-config.xml");
		CarsPartsInventory cpInv = (CarsPartsInventory)ctx.getBean("carPartsInv4");
		
		//Entity class object are not created using spring
//		CarPart cp = new CarPart();
//		cp.setPartName("Door");
//		cp.setCarModel("BMW");
//		cp.setPrice(30000);
//		cp.setQuantity(100);
//		cpInv.addnewPart(cp);
		
		List<CarPart>list = cpInv.getAvailableParts();
		for(CarPart c : list) {
			System.out.println(c.getPartName());
		}
	}

}
