
public class Reviews {
	
	Account account;
	private int stars;
	private String comment;
	
	public Reviews(String username, int stars, String comment) {
		account.username=username;
		this.stars=stars;
		this.comment=comment;
		
	}
	
	public int getStars() {
		return this.stars;
	}
	
	public void setStars(int stars) {
		this.stars=stars;
	}

	
	//getReview from UML is now this printReview 
	public String printReview() {
		return "Username: " + account.username + "\nStars: " + this.stars + "\nComment: " +this.comment;
	}
}
