package PhoneBook;

public class Pbtest {
	public static void main(String args[]) {
		PhoneBook a = new PhoneBook("Kaminey", 3);
		System.out.println(a.getName());
	
//		Adding members inside our PhoneBook
		a.add("Rohit", "8308745001", "rdchilhorkar@gmail.com");
		a.add("Vaishnavi", "4354353425", "vrchilhorkar@gmail.com");
		a.add("Vivek", "9354745001", "vrchilhorkar@gmail.com");
		a.display();		
		
//		Search for the required member
		Contact reqName = a.search("Vishal");		
		if(reqName == null) {
			System.out.println("Not present:  :Returned Null");
		}
		else {
			System.out.println(reqName.getName());
		}
		
//		Update Mobile Number of Rohit
		a.updateNumber("Rohit", "9921888569");
		a.display();
	}
	
}
