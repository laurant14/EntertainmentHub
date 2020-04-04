import java.util.ArrayList;

public class Venue  {
	
	private String venue;
	private String title;
	private double price;
	private String description;
	private String name;
	private String location;
	private Theater[] theaters;
	
	//default
	public Venue() {
		this.venue=venue;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void setTitle(String title) {
		this.title=title;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void setPrice(double price) {
		this.price=price;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public void setDescription(String description) {
		this.description=description;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getLocation() {
		return this.location;
	}
	
	public void setLocation(String location) {
		this.location=location;
	}
	
	public ArrayList<Show> getShowing(String movieName) {
		ArrayList<Show> shows=new ArrayList<Show>();
		for(int i=0;i<theaters.length;i++){
			shows.addAll(theaters[i].getShows(movieName));
		}
		return shows;

	}
	
	
	
	public String printVenue() {
		return "Name: " +this.name + "\nLocation: " + this.location;
	}
	
	public Reviews getReview(Venue venue) {
		
	}
	
	public Tickets getTicket() {
		//TODO
	}

}
