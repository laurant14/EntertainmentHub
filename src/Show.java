
public class Show extends Reviews {

	Venue venue;
	private String showTime;
	private int seats[];
	
	public Show(String username, int stars, String comment, String review) {
		super(username, stars, comment, review);
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
			if(seats[i]== 0l) {
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
