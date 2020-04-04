
public class Show {

	Venue venue;
	private String showType;
	private String showName;
	private String showTime1;
	private String showTime2;
	private String description;
	private String ratings;
	private int seats[];
<<<<<<< HEAD
	private Event event;
	public Show(String username, int stars, String comment) {
		super(username, stars, comment);
=======
	
	//fix this error
	public Show(String showType, String showName, String showTime1, String showTime2, String description,String ratings) {
		super();
>>>>>>> 7fc234a1c2192554a1739d78f71deddc6ce6dd3f
	}
	
	public String getshowType() {
		return this.showType;
	}
	public void setShowType(String showType) {
		this.showType = showType;
	}
	
	public String getshowName() {
		return this.showName;
	}
	public void setShowName(String showName) {
		this.showName = showName;
	}
	public String getShowtime1() {
		return this.showTime1;
	}
	
	public void setShowTime1(String showTime1) {
		this.showTime1 = showTime1;
	}
	
	public String getShowtime2() {
		return this.showTime2;
	}
	
	public void setShowTime2(String showTime2) {
		this.showTime2 = showTime2;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getRating(){
		return this.ratings;
	}
	
	public void setRatings(String ratings){
		this.ratings = ratings;
	}
	public int getSeats() {
		int count = 0;
		for(int i = 0; i < seats.length; i++) {
			if(seats[i]== 0) {
				count++;
			}
		}
		return count;
	}
<<<<<<< HEAD
	
	public Event getEvent() {
		return this.event;
	}
	
	
	//set seats??? idk 
	
=======
	public void setSeats(int seats[]) {
		this.seats = seats;
	}
>>>>>>> 7fc234a1c2192554a1739d78f71deddc6ce6dd3f
	public String getVenue() {
		return "Venue: " +venue.printVenue();
	}

}
