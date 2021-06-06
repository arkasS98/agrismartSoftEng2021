import java.util.ArrayList;

public class Announcement {
	 
	//Attributes
	private String textField;
	ArrayList<Danger> listOfDangers;
	private String topic;
	
	
	//Constructor
	
	public Announcement(Sting txt, String topic) {
		this.textField = txt;
		this.topic = topic;
	}
	
	public Announcement(String txt, Danger danger, String topic) {
		this.textField = txt;
		this.listOfDangers = new ArrayList<Danger>();
		this.listOfDangers.add(danger);
		this.topic = topic;
	}
	 
//Methods
	
	//    *****Sets&Gets*****   
	public String getTextField() {
		return this.textField;
	}
	
	public String getTopic() {
		return this.topic;
	}
	
	public ArrayList<Danger> getDangers() {
		return this.listOfDangers;
	}	
	
	
	
	public void setTextField(String txt) {
		this.textField = txt;
	}
	
	public void setTopic(String topic) {
		this.topic = topic;
	}
	//    *****Sets&Gets*****
	
	public void printDangers() {
		if (!this.listOfDangers.isEmpty()) {
			for (int i = 0; i < this.listOfDangers.size(); i++)
				System.out.println(this.listOfDangers.get(i).getTypeOfDanger() + "\t" + this.listOfDangers.get(i).getLocationOfDanger() + "\t" + this.listOfDangers.get(i).getSeverityOfDanger());
		}
		else 
			System.out.println("This announcement contains no danger!");
	}
}
