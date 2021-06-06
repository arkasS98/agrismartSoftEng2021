public class User {
	//attributes
	
	protected String userEmail = "no value";
	protected String userPassword = "no value";
	protected String username = "no value";
	protected String name = "no value";
	protected String surname = "no value";
	protected String address = "no value";
	protected int phoneNum;
	
	
	
	
	//Constructor
	
	public User(String mail, String pass, String usname, String fname, String lname, String addr, int num) {
		this.userEmail = mail;
		this.userPassword = pass;
		this.username = usname;
		this.name = fname;
		this.surname = lname;
		this.address = addr;
		this.phoneNum = num;
	}
	
	
	
	//Methods
	
	//      ********Sets & Gets********
	public void setEmail(String st) {
		this.userEmail = st;
	}
	
	public String getEmail() {
		return this.userEmail;
	}
	
	
	public void setPassword(String st) {
		this.userEmail = st;
	}
	
	public String getPassword() {
		return this.userPassword;
	}
	
	
	public void setUsername(String st) {
		this.username = st;
	}
	
	public String getUsername() {
		return this.username;
	}
	
	
	public void setName(String st) {
		this.name = st;
	}
	
	public String getName() {
		return this.name;
	}
	
	
	public void setSurname(String st) {
		this.surname = st;
	}
	
	public String getSurname() {
		return this.surname;
	}
	
	
	public void setAddress(String st) {
		this.address = st;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	
	public void setPhoneNum(int n) {
		this.phoneNum = n;
	}
	
	public int getPhoneNum() {
		return this.phoneNum;
	}
	//      ********Sets & Gets********
	
	public boolean Login(String username, String password) {
	if((this.getUsername() == username) && (this.getPassword() == password))
		return true;
	else 
		return false;
	}
	
	

}
