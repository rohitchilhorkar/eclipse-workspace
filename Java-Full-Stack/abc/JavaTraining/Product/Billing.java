package Product;


import java.util.Scanner;

public class Billing extends Product {
	
	Billing() {
		
	}
	public void Order(int id, String name, int reqQuantity) {
		Product item = search(id);
		if(item != null) {
			if(item.getInStock() > reqQuantity ) {
				generateBill(item, reqQuantity);
			}else {
				System.out.println("Out of Stock!");
				System.out.println("Only " + item.getInStock() + " Available");
			}
		}
		else if(item == null){
			System.out.println();
			System.out.println("Sorry, We can't find this product in our Inventory");
			System.out.println("Please, look for any other product to purchase!");
		}
	}
	public void displayBilledItem(int id, int quant) {
		Product info = search(id);
		System.out.println();
		System.out.println(info.getProductId()+ "  " );
		System.out.print(info.getProductName()+"  " );		
		
		
	}
	public void generateBill(Product item, int reqQuantity) {
		System.out.println();
		System.out.println("-----Invoice------");
		displayBilledItem(item.getProductId(), reqQuantity);
		double price = item.getProductPrice();
		double discountedPrice=0;
		
		if(item.getType().equals("Books")) {			
			discountedPrice = price - (price*10)/100;			
		}
		else {
			System.out.println();
			System.out.println("Please enter your age: ");
			Scanner s = new Scanner(System.in);
			int age = s.nextInt();
			s.close();
			if(age >= 0 && age < 4)discountedPrice =  price - (price*15)/100;
			else if(age >= 4 && age < 6)discountedPrice =  price - (price*5)/100;
			else discountedPrice = price;			
		}
		System.out.println();
		System.out.print("Payable Amount:  " + (discountedPrice*reqQuantity));
		
	}
}
