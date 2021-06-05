
public class Service_Request extends Communication_Farmer_Agri{
	
	//attributes
	private String textField = "no value";
	private boolean answerd;
	
	//Constructor
	public Service_Request(Farmer farmer, Agriculturist agriculturist, String text, String topic) {
		super(farmer, agriculturist, topic);
		this.answerd = false;
		this.textField = text;
	}
	
	
	//Methods
	public String getextFiled() {
		return this.textField;
	}
	
	public boolean isAnswerd() {
		return this.answerd;
	}
	
	public void setTextField(String txt) {
		this.textField = txt;
	}
	
	public void setAnwerd(boolean ans) {
		this.answerd = ans;
	}
}
