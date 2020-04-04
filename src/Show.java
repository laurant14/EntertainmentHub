import java.util.ArrayList;

public class Show {

	Venue venue;
	//private String type;
	private String name;
	private String time1;
	private String time2;
	private String description;
	private String ratings;
	private int seats[];
	private Event event;
	private String type;
	
	public Show(String type, String name, String time1, String time2, String description,String ratings) {
		super();
	}
	
	ArrayList<Show> shows = new ArrayList<Show>();
	
	public String getshowType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String getName() {
		return this.name;
	}
	public void setShowName(String name) {
		this.name = name;
	}
	public String gettime1() {
		return this.time1;
	}
	
	public void settime1(String time1) {
		this.time1 = time1;
	}
	
	public String gettime2() {
		return this.time2;
	}
	
	public void settime2(String time2) {
		this.time2 = time2;
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

	
	
	public Show(String username, int stars, String comment) {
		// TODO Auto-generated constructor stub
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
	
	public Event getEvent() {
		return this.event;
	}
	
	public void setSeats(int seats[]) {
		this.seats = seats;
	}
	public String getVenue() {
		return "Venue: " +venue.printVenue();
	}
	
	//to add show from admin account
	public static void add(Show show) {
		// TODO Auto-generated method stub
		
	}

}
