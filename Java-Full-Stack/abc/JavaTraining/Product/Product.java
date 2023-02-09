package Product;

public class Product {

	private String productName;
	private int productId;
	private String type;	
	private int inStock;
	private double productPrice;
	private String productDescription;
	
//	Don't Repeat this
	protected static int index=0;
	protected static Product[] product = new Product[4];
	
	public Product() {
		
	}	
	public Product(String productName, int productId, String type, int inStock, double productPrice,
			String productDescription) {
		super();
		this.productName = productName;
		this.productId = productId;
		this.type = type;
		this.inStock = inStock;
		this.productPrice = productPrice;
		this.productDescription = productDescription;
	}
	
	void add(String productName, int productId, int inStock, double productPrice,String productDescription) {
//		Product data = new Product(productName, productId, type,inStock, productPrice, productDescription);
//		product[index++] = data;		
	}

	void Order(int id, String name, int reqQuantity) {
		
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
	
	Product search(int id) {
		Product obj = new Product();
		for (int j = 0; j < product.length; j++) {			
			obj = product[j];
			if(obj.getProductId() == id)return obj;
		}
		return null;
	}
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getInStock() {
		return inStock;
	}
	public void setInStock(int inStock) {
		this.inStock = inStock;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
		
	
	
	
	
	
}
