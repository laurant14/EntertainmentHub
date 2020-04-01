
public class Show {
	
	Venue venue;
	private String showTime;
	private int seats[];
	
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
	
	//set seats??? idk 
	
	public String getVenue() {
		return "Venue: " +venue.printVenue();
	}

}
