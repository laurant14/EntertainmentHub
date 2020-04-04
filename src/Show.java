
public class Show extends Reviews {

	Venue venue;
	private String showTime;
	private int seats[];
	private Event event;
	public Show(String username, int stars, String comment) {
		super(username, stars, comment);
	}
	
	//will need this to access JSON files
	public Show(String showType, String showName, String time1, String time2, String description) {
		// TODO Auto-generated constructor stub
	}

	public String getShowtime() {
		return this.showTime;
	}
	
	public void setShowTime(String showTime) {
		this.showTime=showTime;
	}
	
	public int getSeats() {
		int count=0;
		for(int i=0; i<seats.length;i++) {
			if(seats[i]==0) {
				count++;
			}
		}
		return count;
		
	}
	
	public Event getEvent() {
		return this.event;
	}
	
	
	//set seats??? idk 
	
	public String getVenue() {
		return "Venue: " +venue.printVenue();
	}

}
