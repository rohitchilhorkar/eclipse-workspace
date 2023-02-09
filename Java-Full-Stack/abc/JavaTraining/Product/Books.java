package Product;

public class Books extends Product{

	
	
	public Books() {		
	
	}
	
	void add(String productName, int productId, int inStock, double productPrice,String productDescription) {
		Product data = new Product(productName, productId, "Books",inStock, productPrice, productDescription);
		product[index++] = data;		
	}
	
	public void changeDescription(int id, String Description) {
		Product currentProduct = search(id);
		if(currentProduct != null)
			currentProduct.setProductDescription(Description); 
		else
			System.out.println("Product of given id doesn't exist!");
	}
	
}
