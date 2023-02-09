package com.pratiti.training.inheritance.v1;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Logger {
		
//		enum type can be passed as an argument to switch statements.
		public void log(String msg, LogLevel level) {
			switch(level) {
				case INFO:
					System.out.println("[INFO] [" + LocalDate.now()+ "] " + msg);
					break;
			
			case WARNING:
				System.out.println("[WARNING] [" + LocalDateTime.now()+ "] " + msg);
				break;
			case ERROR:
				System.out.println("[ERROR] [" + LocalDateTime.now()+ "] " + msg);
			}	
		
	

	}

}
