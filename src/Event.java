
public class Event {
	
	protected String name;
	protected String description;
	protected Reviews reviews;
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public void setDescription(String description) {
		this.description=description;
	}
	
	public Reviews getReviews() {
		return this.reviews;
	}
	
	public void setReviews(String name, Reviews reviews) {
		this.name=name;
		this.reviews=reviews;
	}

}
