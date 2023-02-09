package com.pratiti.training.inheritance.v3;

//CLASS VS INTERFACE
// https://www.simplilearn.com/tutorials/java-tutorial/java-interface

public class LoggerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Logger logger = new Logger();
		Logger logger = LoggerFactory.getLoggerInstance();
		
//		Logger logger = new FileLogger();
//		Logger logger = new ConsoleLogger();
		
//		Sab Runtime par hoga
//		Method usi ka call hoga jiska object banraha hai
//	    logger = new FileLogger();
//		We can change the object to be saved in the reference variable
		
				//		Logger
				//		/    \
				//	   /      \
				//FileLogger	ConsoleLogger

		
     	logger.log("jklfjskf");
		logger.log("Some info message", LogLevel.INFO);
		logger.log("Some warning message", LogLevel.WARNING);
		logger.log("Some error message", LogLevel.ERROR);

	}

}
