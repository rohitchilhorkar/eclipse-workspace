package com.springboot.exception;

//types of exception and extended classes
//Exception - Exception
//Unchecked Exception - RuntimeException

public class CustomerServiceException extends RuntimeException{

	public CustomerServiceException(String errorMessage) {
		super(errorMessage);
	}
}


// To make Exception Class
// We must add compatible Exception type