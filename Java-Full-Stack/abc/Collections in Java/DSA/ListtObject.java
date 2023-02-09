package DSA;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ListtObject {

	public static void main(String[] args) {
		
	List<Person> list3 = new ArrayList<>();
//	List<Person> list4 = new LinkedList()<>();
	
	Person p1 = new Person("Rohit", 23);
	Person p2 = new Person("Vivek", 22);
	Person p3 = new Person("Rohan", 24);
	
	list3.add(p1);
	list3.add(p2);
	list3.add(p3);
//	list4.add(2, p3);
	list3.forEach(obj -> System.out.println(obj.getName()+"     "+ obj.getAge()));
	
	System.out.println();
	
	List<Person> list4 = new ArrayList<>();
	
	list4.add(new Person("Rohit", 23));

	list4.add(new Person("Rohit",23));
	
	list4.add(new Person("Rohan",45));
	list4.add(new Person("Raj",35));
	list4.add(new Person("Ram",65));
	list4.add(new Person("Rohit",4));
	
//	list4.sort((a1,a2)-> p1.getName().compareTo(p2.getName()));
	
//	ReadyMade 
	list4.sort(Comparator.comparing(Person::getAge));	
	
	list4.forEach(i -> System.out.println(i.getName()+"     "+ i.getAge()));
	
	
	}
	
}
