package com.pratiti.training.accessspecificer.v1;
//Kuch nhi likha to package scope
//Public likha to package scope and can be accessed from outside the package
//Private class not valid in java
//Private is only within the class
//Within the package only private is not visible
//From outside only public is accessible

//When a class from another package is imported then public+protected is visible

public class A {
	private int one;	
	int two;
	protected int three;
	public int four;

}
