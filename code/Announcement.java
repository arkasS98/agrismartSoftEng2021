import java.util.ArrayList;

public class Announcement {
	 
	//Attributes
	private String textField;
	ArrayList<Danger> listOfDangers;
	private String topic;
	
	
	//Constructor
	public Announcement(String txt, Danger danger, String topic) {
		this.textField = txt;
		this.listOfDangers = new ArrayList<Danger>();
		this.listOfDangers.add(danger);
		this.topic = topic;
	}
	 
	 
}
