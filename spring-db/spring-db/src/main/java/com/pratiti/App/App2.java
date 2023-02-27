package com.pratiti.App;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pratiti.component.CarPart;
import com.pratiti.component.CarPartsInventoryRepository;
import com.pratiti.component.CarsPartsInventory;

public class App2 {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("my-spring-config.xml");
		CarPartsInventoryRepository cpRepo = ctx.getBean(CarPartsInventoryRepository.class);
		
		//Entity class object are not created using spring
	
//		CarPart cp = new CarPart();
//		cp.setPartName("Seat cover");
//		cp.setCarModel("");
//		cp.setPrice(5000);
//		cp.setQuantity(990);
//		cpRepo.save(cp);
		
		List<CarPart>list = (List<CarPart>) cpRepo.findAll();
		for(CarPart c : list) {
			System.out.println(c.getPartName());
		}
		
		for(CarPart c : cpRepo.findByCarModel("BMW")) {
			System.out.println(c.getCarModel() + " " + c.getPartName());
		}
		
		for(CarPart c : cpRepo.findByPrice(Double.valueOf(499)))
		{
			System.out.println(c.getCarModel() + " " + c.getPrice());
		}
		
		for(CarPart c : cpRepo.fetchByQuantity(199 , Double.valueOf(800)))
		{
			System.out.println(c.getCarModel() + " " + c.getPrice());
		}
	}

}
   