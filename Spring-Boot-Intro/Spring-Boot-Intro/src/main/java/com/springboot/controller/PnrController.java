package com.springboot.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.model.Passengers;
import com.springboot.model.Passengers.Gender;
import com.springboot.model.Passengers.Status;
import com.springboot.model.Pnr;

//Working for Indian Railways
@RestController
@CrossOrigin
public class PnrController {
	
	@GetMapping("/check-pnr-status")
	public Pnr checkStatus(int pnrnumber) {
		
		Pnr pnr = new Pnr();
		pnr.setPnrNo(pnrnumber);
		pnr.setTrainNo(1111);
		pnr.setTravelDate(LocalDate.of(2023, 3, 13));
		
		List<Passengers> passengers = new ArrayList();
		
		Passengers pass1 = new Passengers();
		pass1.setName("Rohit Chilhorkar");
		pass1.setGender(Gender.MALE);
		pass1.setStatus(Status.CONFIRMED);
		passengers.add(pass1);
		
		Passengers pass2 = new Passengers();
		pass2.setName("Swarnika Chilhorkar");
		pass2.setGender(Gender.FEMALE);
		pass2.setStatus(Status.CONFIRMED);
		passengers.add(pass2);
		
		Passengers pass3 = new Passengers();
		pass3.setName("Ranjana Chilhorkar");
		pass3.setGender(Gender.FEMALE);
		pass3.setStatus(Status.WAITING);
		passengers.add(pass3);
		
		Passengers pass4 = new Passengers();
		pass4.setName("Dadarao Chilhorkar");
		pass4.setGender(Gender.MALE);
		pass4.setStatus(Status.RAC);
		passengers.add(pass4);
		
		pnr.setPassengers(passengers);
		return pnr;
	}
}
