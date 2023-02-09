package LambdaExp;

class Hello{
	
	int x = 10;
	void saySomething() {
		System.out.println("Hello Everyone!");
	}
}
class Hi extends Hello{
	
	void saySomething() {
		System.out.println("Hi Everyone!");
	}
}

public class AnonymousClass {

	public static void main(String[] args) {
		
//		Hello h = new Hello();
//		h.saySomething();
		
		Hi hi = new Hi();
		hi.saySomething();
//		Anonymous Inner Class
//		Ye hamesha Child Class hogi, ise parent chaihe ya to class ya to interface
//		We are creating a subclass of Hello Class
//		isko terminate end me karna hai
		Hello anonymous = new Hello() {
			void saySomething() {
				System.out.println("Hi Everyone!");
				System.out.println(x);
			}
		};
		anonymous.saySomething();
		
		String fname = "Rohit";
		String lname = "Chilhorkar";
		(fname, lname) -> System.out.println("Name: "+fname);
		
	}
}
