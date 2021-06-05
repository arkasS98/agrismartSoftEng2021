import java.util.ArrayList;

public class Farmer extends User {
	
	//attributes
	ArrayList<Cultivation> listOfCultivations /*= new ArrayList<Cultivation>()*/;
	ArrayList<Product> listOfProducts /*= new ArrayList<Product>()*/;
	
	
	//Constructor
	
	public Farmer(String mail, String pass, String usname, String fname, String lname, String addr, int num, Product product, Cultivation cultivation) {
		super(mail, pass, usname, fname, lname, addr, num);
		this.ListOfProducts = new ArrayList<Product>;
	    	this.ListOfProducts.add(product);
	    	
	    	this.ListOfCultivations = new ArrayList<Cultivation>;
	    	this.ListOfCultivations.add(cultivation);
	}
}
