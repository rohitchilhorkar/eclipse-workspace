package com.pratiti.spring.Banking;

import org.springframework.stereotype.Component;

@Component("iciciBank")
public class IciciBank implements Bank{

	public boolean isCustomer(int accNo) {
		if(accNo == 1111) {
			return true;
		}
		return false;
	}
	public boolean canWeWithdraw(int atmId, int accNo, double amount) {
		// TODO Auto-generated method stub
		System.out.println("Withdrwal Approved for ICICI customer!!");
		return true;
	}

}
