package com.pratiti.spring.Banking;


public interface Bank {

	boolean canWeWithdraw(int atmId, int accNo, double amount);
	boolean isCustomer(int accNo);
	
}
