package Basics;
import java.util.ArrayList;
public class ArrayList_explored {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<>();
		
		names.add("Rohit");
		names.add("Rohan");
		names.add("Ravi");
		names.add("Raj");
		names.add("Rahul");
		
//		System.out.println(names);
//		
		names.remove(4);
//		System.out.println(names);
		names.set(2, "Siddharaj");
//		for (String string : names) {
//			System.out.println(string);
//		}
//		
		names.forEach((n) -> 
		{System.out.println(n);});
	}

}
