import java.util.Scanner;

public class Review {
	//attributes
	private int rate;
	private User user;
	private User receiver;
	private String textField;
	
	//constructor
	public Review(int rate, User user, User receiver, String text) {
		Scanner testrate = new Scanner(System.in);
		while(rate < 0 && rate > 5) {
			System.out.println("Wrong value!");
			System.out.println("Value must be an integer value [0,5].");
			System.out.println("Enter new value: ");
			rate = testrate.nextInt();
		}
		this.rate = rate;
		this.user = user;
		this.receiver = receiver;
		this.textField = text;
	}
	
	//methods
	
	//    *****Sets&Gets*****
	public int getRate() {
		return this.rate;
	}
	
	public User getUser() {
		return this.user;
	}
	
	public User getReceiver() {
		return this.receiver;
	}
	
	public String getText() {
		return this.textField;
	}
	//    *****Sets&Gets*****
	
	public void showReview() {
		System.out.println("For user " + this.receiver.getUsername() + ", by user " + this.user.getUsername()".");
		System.out.println("Rate: " + this.rate);
		System.out.ptintln("Details: " + this.textField);
	} 
}
