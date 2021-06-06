import java.util.concurrent.ThreadLocalRandom;


public class Transaction {
	
	//attributes
	private User seller;
	private User buyer;
	private Product product;
	private	int id;
	
	//constructor
	public Transaction(User seller, user buyer, Product prod) {	
		int rand_int = ThreadLocalRandom.current().nextInt();
	    if(rand_int < 0)
	    	rand_int *= -1;
	    this.id = rand_int;
	    this.seller = seller; 
	    this.buyer = buyer;
	    this.product = prod;
	}
	
	//methods
	
	public User getBuyer() {
		return this.buyer;
	}
	
	public User getSeller() {
		return this.seller;
	}
	
	public Product getProduct() {
		return this.product;
	}
	
	public int getId() {
		return this.id;
	}
}
