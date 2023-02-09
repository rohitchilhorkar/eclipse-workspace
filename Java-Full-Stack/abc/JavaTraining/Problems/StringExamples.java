package Problems;
import java.util.Arrays;

public class StringExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Rohit Chilhorkar Pusad";
		
		System.out.println(str.charAt(3));
		
		//Returns
//		0-equal
//		<0 - lexicographically less
//		>0 - lexicographically more
		System.out.println(str.compareTo("Rohit"));
		
		System.out.println(str.concat(" Chilhorkar"));

//		If it contains the sequence true else false
		System.out.println(str.contains("it"));

		System.out.println(str.endsWith("t"));
		System.out.println(str.isEmpty());
		System.out.println(str.intern());
		
//		Gives hashcode of given string
		System.out.println(str.hashCode());
		System.out.println(str.substring(2,9));
		
		
		
		System.out.println(str.length());
		System.out.println(str.strip());
		
		System.out.println("the".repeat(5));
		System.out.println(str.replace('i','t'));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
	
		String regex = "1001RRohitChilhorkar";
		
//		It splits string on the basis of char passed inside the parameters
		String[] data = regex.split("1");
		System.out.println(Arrays.toString(data));
	
	
		System.out.println("Hello ");
	
}

}