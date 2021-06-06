import java.util.ArrayList;

public class Trader extends User{
    ArrayList<Business> listOfBusiness;
    ArrayList<Product> listOfProducts;

    public Trader(String mail, String pass, String usname, String fname, String lname, String addr, int num) {
        super(mail, pass, usname, fname, lname, addr, num);
        this.listOfBusiness = new ArrayList<Business>();
        this.listOfProducts = new ArrayList<Product>();
    }
}
