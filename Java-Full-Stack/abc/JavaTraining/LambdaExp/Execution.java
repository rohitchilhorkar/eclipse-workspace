package LambdaExp;

@FunctionalInterface
//An interface with single abstract method is called functional interface.
interface Printer{
	
	void print(String Document);
}

class Function implements Printer{
	
	@Override
	public void print(String Document) {
		System.out.println("Hi Kya Mai Dikhai De Raha Hun");
	}
}
public class Execution {
	
	public static void main(String[] args) {
		
		Printer p = new Function();
		p.print("ROhit");
		
		Printer p2 = new Printer() {
			public void print(String Document) {
				System.out.println("Hun");
			}
		};
		
//		p2.print("e");
		
//		We are overloading a method here, but name don't know
//		ONly one lambda must be present in interface
//		
		Printer p3 = (document) -> System.out.println("Lambda Function invoked!!! ");
	}

}































