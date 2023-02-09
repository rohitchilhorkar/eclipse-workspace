package Product;

public class Toys extends Product{	
	
	public Toys() {
		
	}
			
	void add(String productName, int productId, int inStock, double productPrice,String productDescription) {
		Product data = new Product(productName, productId, "Toys",inStock, productPrice, productDescription);
		product[index++] = data;		
	}
	void display() {		
		System.out.print("Product Id | Product Name | inStock | Product Price | Product Description\n");
		for (int i = 0; i < product.length; i++) {		
			
			Product info = product[i];
			if(info != null) {
			System.out.print("\n"+info.getProductId()+ "  " );
			System.out.print(info.getProductName()+"  " );
			System.out.print(info.getType()+"  " );
			System.out.print(info.getInStock()+ "  " );
			System.out.print( info.getProductPrice()+ "  " );
			System.out.print( info.getProductDescription()+ "  " );
			}
			else {
				System.out.println(i);
			}
		}
	}
	
}
