package springmvc.week3.model;

public class Product {

	int productId;
	String productName;
	double productPrice;
	
	
	public Product()
	{
		
	}
	public Product(int productId, String productName) {
		super();
		this.productId = productId;
		this.productName = productName;
	}

	public int getproductId() {
		return productId;
	}
	public void setproductId(int productId) {
		this.productId = productId;
	}
	public String getproductName() {
		return productName;
	}
	public void setproductName(String empName) {
		this.productName = empName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "Employee Id=" + productId + " \n; Employee Name=" + productName;
	}
	
}
