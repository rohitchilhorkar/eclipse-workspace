
package DSA;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sett {
	
	public static void main(String[] args) {
//--------------------------------------------------HASHSET--------------------------------------------------------------------
		
//	Set<String> name = new HashSet<>();
//	name.add("Rohit");
//	name.add("Rohan");
//	name.add("Raj");
//	name.add("Ram");
//	name.add("Rahul");
//	name.add("Rohit");
//	
		
		
//--------------------------------------------------TREESET--------------------------------------------------------------------
//		Used for sorting purpose
//		For sorting user defined class, we must implement comparable in Person class
//		Alternate is comparator class, we use inner class for this
		
		
//--------------------------------------------------Comparator's--------------------------------------------------------------------
//------------------------------------------------------Age--------------------------------------------------------------------
		class PersonAgeComparator implements Comparator<Person>{

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
//				return o1.getAge() - o2.getAge();	ASC
				return o2.getAge() - o1.getAge(); //DESC
			}		
		}
//------------------------------------------------------Name--------------------------------------------------------------------
		class PersonNameComparator implements Comparator<Person>{

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getName().compareTo(o2.getName());
			}
			
//			My Logic
//			public int compare(Person o1, Person o2) {
//				int ascii1=0;
//				String name = o1.getName();
//			for(int i=0; i<o1.getName().length(); i++)
//				ascii1 += name.charAt(i);
//			int ascii2=0;
//			name = o2.getName();
//			for(int i=0; i<o2.getName().length(); i++)
//				ascii2 += name.charAt(i);
//			return ascii1 - ascii2;
//			}
		}
//--------------------------------------------------Name and Age--------------------------------------------------------------------
		
		class PersonNameandAgeComparator implements Comparator<Person>{
			@Override
			public int compare(Person o1, Person o2) {
			
				int order = o1.getName().compareTo(o2.getName());
				
//				f1 = 9.22
//				f2 = 9.12
//				f3 = f1-f2 = 0.12
//				since the return type is int 0.12 is converted to 0, hence end up getting wrong output
//				to compare decimal also we need wrapper class, as it has ready made function
				if(order!=0)
					order = Integer.compare(o1.getAge(),o2.getAge());
				return order;
			}
		}
		
//------------------------------------------------------ Declaration ----------------------------------------------------------------------------//
		Set<Person> name4 = new TreeSet<>(new PersonNameandAgeComparator());
		
		
		name4.add(new Person("Rohit",23));
		name4.add(new Person("Rohan",45));
		name4.add(new Person("Raj",35));
		name4.add(new Person("Ram",65));
		name4.add(new Person("Rohit",4));
		
		name4.forEach(names -> System.out.println(names.getName()+ " " + names.getAge()));
		

//--------------------------------------------------TREESET----------------------------------------------------//----------------
	
	Set<Person> names2 = new HashSet<>();
	System.out.println();
//	We must override the toString and hashCode methods to avoid set from inserting Duplicate elements
	names2.add(new Person("Rohit", 25));
	names2.add(new Person("Rohan", 23));
	names2.add(new Person("Rohit", 22));
	names2.add(new Person("Rohit", 24));
	names2.forEach(names -> System.out.println(names.getName()+ " " + names.getAge()));
	
	
	}
	
}
