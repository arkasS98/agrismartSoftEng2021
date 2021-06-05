import java.time.*;

public class Communication {
	
	//attributes
	protected Farmer farmer;
	protected LocalDate date;
	protected LocalTime time;
	protected String topic = "no value";
	
	//Constructor
	public Communication(Farmer farmer, String topic) {
		this.farmer = farmer;
		this.topic = topic;
		LocalDate dObj = LocalDate.now();
		LocalTime tObj = LocalTime.now();
		this.date = dObj;
		this.time = tObj;
	}
	
	
	
	//Methods
	
	//    *****Sets&Gets*****    
	public LocalDate getDate() {
		return this.date;
	}
	
	public LocalTime getTime() {
		return this.time;
	}
	
	public Farmer getFarmer() {
		return this.farmer;
	}
	
	public String getTopic() {
		return topic;
	}
	
	public void setTopic(String topic) {
		this.topic = topic;
	}
	//    *****Sets&Gets*****    
}
