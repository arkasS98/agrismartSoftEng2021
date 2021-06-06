public class Business {
	 //attributes
	 private String name;
	 private String  address;
	 private int  phoneNum;
	 private int afm;
	 
	 //constructor
	 public Business (String name, String address, int phone, int afm) {
		 this.name = name;
		 this.address = address;
		 this.phoneNum = phone;
		 this.afm = afm;
	 }
	 
	 //methods
	 
	 //    *****Sets&Gets*****
	 public String getBusinessName() {
		 return this.name;
	 }
	 
	 public String getBusinessAddress() {
		 return this.address;
	 }
	 
	 public int getBusinessPhone() {
		 return this.phoneNum;
	 }
	 
	 public int getBusinessAfm() {
		 return this.afm;
	 }
	 
	 public void setBusinessName(String s) {
		 this.name = s;
	 }
	 
	 public void setBusinessAddress(String s) {
		 this.address = s;
	 }

	 public void setBusinessPhone(int i) {
		 this.phoneNum = i;
	 }

	 public void setBusinessAfm(int i) {
		 this.afm = i;
	 }
	 //    *****Sets&Gets*****
}
