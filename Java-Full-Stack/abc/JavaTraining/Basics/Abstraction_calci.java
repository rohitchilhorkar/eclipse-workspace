package Basics;

public class Abstraction_calci {
	
	
	public static void Main(String[] args) {
		
		// TODO Auto-generated method stub
		Calculator a = new Calculator();
		int ans = a.add(3, 10);
		System.out.println(ans);

	}
	public static class Calculator{
		public int add(int x, int y) {return (x+y);}
		public int sub(int x, int y) {return (x-y);}
		public int mul(int x, int y) {return (x*y);}
	}
	
	
}
