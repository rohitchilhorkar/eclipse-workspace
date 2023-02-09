package Problems;

import java.util.Scanner;

public class MiniCalci {

	public static void main(String[] args) {
		
		System.out.println("Hey User!\nWhat's up..");
		
		System.out.println("Welcome to my Mini Calci");
		System.out.println("Which operation do you want to perform: ");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		
		System.out.println("Enter your choice: ");
		
		Scanner s = new Scanner(System.in);
		int choice = s.nextInt();
		
		System.out.println("Enter 2 numbers: ");
		
		int first, second;
		first = s.nextInt();
		second = s.nextInt();
		
		System.out.print("Result of ");

		switch(choice) {
		case 1:
			System.out.println("Addition: " + (first+second));
			break;
		case 2:
			System.out.println("Subtraction: " + (first-second));
			break;
		case 3:
			System.out.println("Multiplication: " + (first*second));
			break;
		case 4:
			System.out.println("Division: " + (first/second));
			break;
		}
	}
}
