package WrapperClass;

public class ConversionEx {
	public static void main(String[] args) {
	
		
//		String to int -> Integer.parseInt(x);	
		
//		String to Integer -> Integer.parseInt(x);
		
//		int to String -> String.valueOf(r);
		
//		Integer to String -> Integer.toString(s);
		
//		Double to Integer ->  Double.intValue();
		
//		double to Integer -> Integer.valueOf((int) doub2); 
		
//		String to Double -> Double.parseDouble(sample22);
		
//	    String to double -> Double.parseDouble(sample);
//		String to int		
		String x = "10110";		
		int integerVal = Integer.parseInt(x);		
		System.out.println("String: " + x + "\nInteger: "+integerVal);
		
//		String to Integer
		String str = "10110";		
		Integer i = Integer.parseInt(x);		
		System.out.println("\nString: " + str + "\nInteger: "+i);
		
//		int to String
		int r = 12;
		String my = String.valueOf(r);
		System.out.println("\nint: " + r + "\nString: "+my);
		
//		Integer to String
		Integer s = 12;
		String str1 = Integer.toString(s);
		System.out.println("\nInteger: " + s + "\nString: "+str1);
		
//		Double to Integer
		Double doub = 23.03;
		Integer inte = doub.intValue();
		System.out.println("\nDouble: " + doub + "\nInteger: "+inte);
		
//		double to Integer
		double doub2 = 32.34;
		Integer r2 = Integer.valueOf((int) doub2); 
		System.out.println("\ndouble: " + doub2 + "\nInteger: "+r2);
		
//		String to Double
		String sample22 = "453.435";
		Double arc2 = Double.parseDouble(sample22);
		System.out.println("\nString: " + sample22 + "\nDouble: "+arc2);
		
//	    String to double
		String sample = "453.435";
	    double arc = Double.parseDouble(sample);
     	System.out.println("\nString: " + sample + "\ndouble: "+arc);

	}
}
