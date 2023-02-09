package ObjectClass;

import java.util.Objects;

public class PersonTest {
	
	public static void main(String[] args) {
		
		Person p = new Person("Rohit", 22);
		System.out.println(p.getName() + " " + p.getAge());
		
		System.out.println(p);
		
		Person p2 = new Person("Rohit", 22);
		
		System.out.println(p == p2);
		System.out.println(p.equals(p2));
		System.out.println(Objects.equals(p, p2));
		
//		We had a joke in this context
//		To use clone we must override it, create an interface named as cloneable
//		agar sab hame hi karna hai to rakha kyu hai ye method
		Person p3 = (Person)p.clone();
		
//		Java doesn't support **operator overloading**
		
		
	}
}