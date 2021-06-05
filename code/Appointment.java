import java.time.*;
public class Appointment extends Farmer_Agriculturist_Communication{
	//attributes
	private boolean availability;
	private LocalDate meetingDate;
	private LocalTime meetingTime;
	
	//Constructor
	public Appointment(Farmer farmer, Agriculturist agriculturist, String topic, LocalDate meetingdate, LocalTime meetingtime) {
		super(farmer, agriculturist, topic);
		this.meetingDate = meetingdate;
		this.meetingTime = meetingtime;
		this.availability = true;
	}
	
	//Methods
	public LocalDate getMeetingDate() {
		return this.meetingDate;
	}
	
	public LocalTime getMeetingTime() {
		return this.meetingTime;
	}
	
	public void setDate(LocalDate date) {
		this.meetingDate = date;
	}
	
	public void setTime(LocalTime time) {
		this.meetingTime = time;
	}
	
	public boolean isAvailable() {
		return this.availability;
	}
	
	public void setAvailability(boolean a) {
		this.availability = a;
	}
	
	
}
