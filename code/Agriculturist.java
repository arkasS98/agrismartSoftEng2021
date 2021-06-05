import java.util.ArrayList;
import java.util.Scanner;
import java.time.*;

public class Agriculturist extends User{
	
	//attributes
	ArrayList<Product> listOfProducts;	
	ArrayList<Appointment> listOfAppointments;
	ArrayList<Service_Request> listOfRequests;
	
	//Constructor 
	public Agriculturist(String mail, String pass, String usname, String fname, String lname, String addr, int num) {
		super(mail, pass, usname, fname, lname, addr, num);
	}
	
	
	//Methods 
	
	public void createAnnouncement(String text, Danger dang, String topic) {
		Scanner textScan = new Scanner(System.in);
		text = textScan.nextLine();
		Scanner topicScan = new Scanner(System.in);
		topic = topicScan.nextLine();
		// Tha uparxei etoimo Danger h tha ftiaxnoume tote???
		Announcement announ = new Announcement(text, dang, topic);
	}
	

	public int todaysAppointCount() {
		int count = 0;
		LocalDate today = LocalDate.now();
		if (!this.listOfAppointments.isEmpty())/*elegxoume an o xristis exei appointment genika*/ {
			for (int i = 0; i < this.listOfAppointments.size(); i++) {
				if(this.listOfAppointments.get(i).getDate().compareTo(today) == 0)//elegxoume posa rantevou exei gia shmera 
					count++;
			}
			return count;                                                 //an count == 0 XWRIS
		}                                                                 //NA EMFANISTEI MHNYMA
		else {                                                            //AFTO SHMAINEI OTI
			System.out.println("The appointment's list is empty.");       //DEN YPARXOUN RANTEVOU
			return count;                                                 //MONO GIA SHMERA
		}
	}
	
	public void showAppointments() {
		if (this.todaysAppointCount() > 0) {
			int num;
			for (int i = 0; i < this.todaysAppointCount(); i++) {
				num = i + 1;
				System.out.println("Appointment No." + num + ": " + this.listOfAppointments.get(i).getFarmer().getName() + " " + this.listOfAppointments.get(i).getFarmer().getSurname() + " " + this.listOfAppointments.get(i).getFarmer().getAddress() + " " + this.listOfAppointments.get(i).getTopic());
			}
		}
	}
}
