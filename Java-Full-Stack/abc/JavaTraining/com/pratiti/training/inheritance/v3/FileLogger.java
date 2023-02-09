package com.pratiti.training.inheritance.v3;


import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class FileLogger extends Logger {
	
	@Override
	public void log(String msg, LogLevel level) {
		
//		To excecute the code written inside the parent method we must write
//		super.log() function here that too in the beginning
		try(FileWriter fw = new FileWriter("app.log", true)){
			
		switch(level) {
			case INFO:
				fw.write("[INFO] [" + LocalDate.now()+ "] " + msg + "\n");
				break;
		
		case WARNING:
			fw.write("[WARNING] [" + LocalDateTime.now()+ "] " + msg + "\n");
			break;
		case ERROR:
			fw.write("[ERROR] [" + LocalDateTime.now()+ "] " + msg + "\n");
		}	
     	}catch (IOException e) {
			//Keeping it blank, --> not good idea
		}
	}
}
