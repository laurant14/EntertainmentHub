
public class Venue {
	
	private String venue;
	private String title;
	private double price;
	private String description;
	private String name;
	private String location;
	private Theater[] theaters;
	Reviews review = new Reviews();
	Tickets ticket = new Tickets();
	
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
	
	public String printVenue() {
		return "Name: " +this.name + "\nLocation: " + this.location;
	}
	
	public String getReview() {
		return review.printReview();
	}
	
	public String getTicket() {
		return ticket.printTicket();
	}

}
