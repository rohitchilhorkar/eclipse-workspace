package com.pratiti.training.inheritance.v3;


public class Logger {
		
	public void log(String msg) {
		log(msg, LogLevel.ERROR);
	}
	
	public void log(String msg, LogLevel level) {
		
	}
	
//	Points to remember for "abstract" class
	
//	An abstract class must be declared with an abstract keyword.
//	It can have abstract and non-abstract methods.
//	It cannot be instantiated.
//	It can have constructors and static methods also.
//	It can have final methods which will force the subclass not to change the body of the method.
	
//	If we use interface instead of class > no working changes
//	Replace extends keyword with implements
//	abstract classes need not be declare abstract
//	But non abstract class must be declared default
//	Interface: all the methods in an interface are declared with the empty body
//	all the fields are public, static and final by default.
//	A class that implements an interface must implement all the methods declared in the interface.
	 
//	Class must be extended in order to use abstract keyword
//	To be written in empty class
//	Body of abstract method must be empty, otherwise it will give an error
	
	
//	Since this method is overloaded the above function will not get executed
//	The Control will directly pass to the overloaded method
//	It also depends on the type of object created
	
//							Logger
//							/    \
//						   /      \
//					FileLogger	ConsoleLogger

}
