package Inheritance.simple.example;

public class TestFestival {
	public static void main(String[] args) {
		Festival f = new Diwali();
		Festival d = new Festival();
		
		System.out.println(d.getMonth());
//		String month = "December";
////		month = "November";
//	
////		Since we made f under class Festival we can easily switch in runtime like shown below
//		if(month == "November")
//			f = new Diwali();
//		else if(month == "December")
//			f = new Christmas();
//		
//		System.out.println(f.getNoOfDaysLeave());
//		System.out.println(f.getNameOfMonth());
	}
}
