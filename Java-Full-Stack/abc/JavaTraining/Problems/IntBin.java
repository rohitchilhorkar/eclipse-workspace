package Problems;

import java.util.Scanner;

public class IntBin {

	static void binary(int n) {
		int bin=0;
		String binary="";
		int zeros=0,ones=0;
		while(n>0) {
			int unit = n%2;
			bin = bin*10 + unit;
			binary += unit;
			n/=2;	
			if(unit != 0)ones++;
			else zeros++;
		}	
		
		System.out.println(bin);
		System.out.println(binary);
		System.out.println("Zeroes: "+zeros);
		System.out.println("Ones: "+ones);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer");
		int number = input.nextInt();
		
		//Direct Function
//		It returns String Integer.toBinaryString(num);
		
		String bina = Integer.toBinaryString(number);
		System.out.println("First: "+Integer.toBinaryString(number)+"    "+bina);
		binary(number);
		
		Integer.decode(bina);
		input.close();

	}
//	
//	10%2 = 0
//	5%2 = 1
//	2%2 = 0
//	1%2 = 1

}
