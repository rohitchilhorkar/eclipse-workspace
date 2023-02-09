package LambdaExp;

class A /*extends Some Class*/{
	private int x = 897;
	static void hello() {
		
	}
	void hellos() {
		
	}
//	Inner class shows essence of multiple inheritance
	class B /*extends SomeAnotherClass*/{
		void check() {
			A a = new A();
			System.out.println(a.x);
		}
	}
//	Static inner class
//	Class static banaya to pur class method static nhi honge
//	unko alg se static banana padega
//	Iska object directly bana sakte ho
//	A static class can access only the static members of the outer class.
	static class sclass{
		
		void check() {
			A a = new A();
			System.out.println(a.x);
			
//			When the method is declared as static
			A.hello();
//			OtherWise
			a.hellos();		
			
		}
	}
}

public class InnerClass {
	public static void main(String[] args) {
//		A.B a = new A(). new B();
//		a.check();
		
//		For Static class
		A.sclass s = new A.sclass();
		
		A.B b = new A(). new B();
		
		b.check();
		
		
//		Difference between Inner Classes and Static classes
//		A static nested class may be instantiated without instantiating its outer class.
//		Inner classes can access both static and non-static members of the outer class.
//		A static class can access only the static members of the outer class.
	}
}
