package Product;

public class Tester {

	public static void main(String[] args) {
		
//		
		
		Product book = new Books();
		book.add("Chanakya Neeti", 1001, 5, 301, "Based on Chanakya Neeti");
		book.add("Bhagawad Gita", 1002, 20, 203, "Based on Life");	
		
		Product toy = new Toys();
		toy.add("Kite", 1003, 8, 23.35, "Made in India");
		toy.add("Smasher", 1004, 6, 23.35, "Made in Factory");
				
		Product n = new Product();
//		n.add("Chanakya Neeti", 1001,"Books", 5, 301, "Based on Chanakya Neeti");
//		n.add("Bhagawad Gita", 1002,"Books", 20, 203, "Based on Life");
//		n.add("Kite", 1003,"Toys", 8, 23.35, "Made in India");
//		n.add("Smasher", 1004,"Toys",6, 23.35, "Made in Factory");
		
//		toy.display();
//		book.display();
		n.display();
		
		Product myOrder = new Billing();
		myOrder.Order(1003, null, 4);
		
	}
}
