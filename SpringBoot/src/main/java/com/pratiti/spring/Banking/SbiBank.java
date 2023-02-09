package com.pratiti.spring.Banking;

import org.springframework.stereotype.Component;

@Component
public class SbiBank implements Bank {

	public boolean isCustomer(int accNo) {
		if(accNo == 2222) {
			return true;
		}
		return false;
	}
	public boolean canWeWithdraw(int atmId, int accNo, double amount) {
		// TODO Auto-generated method stub
		System.out.println("Withdrwal Approved from SBI Customer!!");
		return true;
	}
}
