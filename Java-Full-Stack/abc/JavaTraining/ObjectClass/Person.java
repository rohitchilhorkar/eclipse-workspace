package ObjectClass;

import java.util.Objects;

public class Person /*extends Objects*/ {
	
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Person() {
		
	}
	
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ",\n age=" + age + ",\n getName()=" + getName() + ",\ngetAge()=" + getAge()
				+ ",\n getClass()=" + getClass() + ",\nhashCode()=" + hashCode() + ",\n toString()=" + super.toString()
				+ "]";
	}
	
	
//	It is mandatory to override hashcode() and equals() parallely
	
//	equal objects must have equal hash codes. 
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		
//		This is not as same as equals since it is of class Objects
//		Objects.equals is internally using equals function that's why we 
//		must override the equals funtion
		return age == other.age && Objects.equals(name, other.name);
	}
	
	
	
	
}
