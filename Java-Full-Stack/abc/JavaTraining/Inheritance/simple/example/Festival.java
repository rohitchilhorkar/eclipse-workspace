package Inheritance.simple.example;
import java.lang.*;

public class Festival {

			int getNoOfDaysLeave() {
			return 3;
		}
		String getNameOfMonth() {
			return "December";
		}	
}
	
class Diwali extends Festival{
		int getNoOfDaysLeave() {
			return 5;
		}
		
		String getMonth() {
			return "November";
		}
	}
	
class Christmas extends Festival{
		int getNoOfDaysLeave() {
			return 2;
		}
		
		String getNameOfMonth() {
			return "December";
		}
	}

