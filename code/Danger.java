import java.util.Scanner;

public class Danger {
	
	//attributes
	private String typeOfDanger;
	private int severityOfDanger;
	private String locationOfDanger;
	
	//constructor
	public Danger(Stirng type, String location, int severity) {
		this.typeOfDanger = type;
		this.locationOfDanger = location;
		Scanner testSev = new Scanner(System.in);
		while(severity < 0 && severity > 3) {
			System.out.println("Wrong value!");
			System.out.println("Value must be an integer value [0,3].");
			System.out.println("Enter new value: ");
			severity = testSev.nextInt();
		}
		this.severityOfDanger = severity;
	}
	
	//methods
	
	//    *****Sets&Gets*****
	public String getTypeOfDanger() {
		return this.typeOfDanger;
	}
	
	public String getLocactionOfDanger() {
		return this.locationOfDanger;
	}
	
	public int getSeverityOfDanger() {
		return this.severityOfDanger;
	}
	
	public void setTypeOfDanger(String type) {
		this.typeOfDanger = type;
	}
	
	public void setLocationOfDanger(String loc) {
		this.locationOfDanger = loc;
	}
	
	public void setSeveriryOfDanger(int i) {
		if(!(severity < 0 && severity > 3)) {
			this.severityOfDanger = i;
		}
		else  {
			System.out.println("Wrong value!");
			System.out.println("Value must be an integer value [0,3].");
			System.out.println("Try again!");
		}
	}
	//    *****Sets&Gets*****
}
