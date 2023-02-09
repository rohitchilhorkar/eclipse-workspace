package LambdaExp;


interface Math{
	public void add(int x, int y);
}

class adding implements Math{
	
	public void add(int x, int y) {
		System.out.println("Result: " + (x+y));
	}
}
public class ExampleLambda {

	public static void main(String[] args) {
		

	Math m = new adding();
	m.add(3,6);
	
//	Anonymous Function
	Math m2 = new Math() {
		public void add(int x, int y) {
			System.out.println("Result: " + (x+y));
		}
	};
	m2.add(23,56);
	
//	Lambda Function called, Interface name must be written here
//	m3 is just reference to Math interface but the object is made of class only
//	Anonymous class is used to write overrided methods
//	Lambda use krne ke liye interface hona chahiye vo bhi sirf 1 method ke saath
	Math m3 = (x,y)->System.out.println("Result: " + (x+y));
	
	m3.add(980, 24);
	
	
	
	}
}
