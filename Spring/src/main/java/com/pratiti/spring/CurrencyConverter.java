package com.pratiti.spring;

import org.springframework.stereotype.Component;

@Component("currConv") // 
public class CurrencyConverter {
	public double convert(String from, String to, double amount) {
		if(from.equals("USD") && to.equals("INR")){
			return amount * 82.64;			
		}else if(from.equals("GBP") && to.equals("INR"))
			return amount * 99.95;
		else 
			return 0;
	}
}
