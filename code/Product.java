public class Product {
	
	//attributes
	private String name;
	private double price;
	private int quantity;
	private boolean availability;
	
	//constructor
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.availability = true;
	}
	
	//methods
	
	//    *****Sets&Gets*****
	public String getName() {
		return this.name;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	public boolean isAvailable() {
		return this.availability;
	}
	
	public void setName(String s) {
		this.name = s;
	}
	
	public void setPrice(double d) {
		this.price = d;
	}
	
	public void setQuantity(int i) {
		this.quantity = i;
	}
	
	public void setAvailability(boolean b) {
		this.availability = b;
	}
	//  *****Sets&Gets*****
	
	public boolean saleProduct(int quant) {
		if(quant <= this.quantity) {
			double total = quant*this.price;
			System.out.println("Total cost: " + total + "Euros");
			this.quantity -= quant;
			
			return true;
		}
		
		else 
			return false;
	}
}
