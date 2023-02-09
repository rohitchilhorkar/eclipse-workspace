package WrapperClass;

public class WrapperClass {
	
//	* Java doesn't support primitive datatypes in some scenarios
//	* Collections doesn't support it
//	* We have to convert String to Integer then we need to use parseInt() method     
//	because String isn't a wrapper class.
//	* The valueOf() method returns an instance representing the specified int 
//	value.
//  * It returns cached values which makes it efficient. It always caches values 
//	between -128 to 127 but can also cache other values outside this range.
	
//	int a = 10; Primitive Data Type
//	Integer a = 10; Wrapper Class
//	Integer a = new Integer(10) No need to do this
//	double = Double
//	float = Float
//	String to int => parseInt()
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		Integer b = 10;
//		Integer c = new Integer(10);
		
//		“Boxing” refers to converting a primitive value into a corresponding wrapper 
//		object. Because this can happen automatically, it's known as autoboxing.
//
//		Similarly, when a wrapper object is unwrapped into a primitive value then 
//		this is known as unboxing.
		
		int d = a; //unBoxing -> converting Integer to int
		Integer e = 10; //Auto/Boxing -> converting int to Integer
		
//		Similar to string pool, a pool of Integer is created for a range in -128 to 
//		127
		
		Integer first = 100;
		Integer second = 100;		
		System.out.println(first == second); 		//true
		
		first = 1000;
		second = 1000;		
		System.out.println(first == second); 		//false
		
//		Internally it uses valueOf() function
	//	Integer value = 3;
	//  Integer value = Integer.valueOf(3);

//		NUll
//		In DataBase we can give null in NUMBER, Double
//		In Java we can't give null to primitive datatype int
//		With Wrapper Class's Integer it is possible
//		Therefore we must use wrapper class while dealing with null in DB
		Integer Null = null;
		
//		Wrapper Classes are immutable as Strings
//		It will create new object in the memory

	}

}
