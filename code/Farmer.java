import java.util.ArrayList;

public class Farmer extends User {
	
	//attributes
	ArrayList<Cultivation> listOfCultivations /*= new ArrayList<Cultivation>()*/;
	ArrayList<Product> listOfProducts /*= new ArrayList<Product>()*/;
	
	
	//Constructor
	
	public Farmer(String mail, String pass, String usname, String fname, String lname, String addr, int num) {
		super(mail, pass, usname, fname, lname, addr, num);
	}
}
