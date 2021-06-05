import java.util.ArrayList;

public class Trader extends User{
    private ArrayList<Business> listOfBusiness;
    private ArrayList<Product> listOfProducts;

    public Trader(String mail, String pass, String usname, String fname, String lname, String addr, int num) {
        super(mail, pass, usname, fname, lname, addr, num);
    }
}

