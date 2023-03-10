package com.pratiti.spring.Banking;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HdfcAtm implements Atm{
	
	@Autowired
	private List<Bank> bank;	

	public void withdraw(int accNo, double amount) {
		// TODO Auto-generated method stub
		System.out.println("Withdrawal Request @ HDFC Atm");
		Bank currBank = null;	
		for(Bank bank : bank) {
			if(bank.isCustomer(accNo)) {
				currBank = bank;
			}
		}
		currBank.canWeWithdraw(2222, accNo, 324);
		
	}


	

}
