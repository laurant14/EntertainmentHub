
public class Reviews {
	
	Account account;
	private int stars;
	private String comment;
	
	public Reviews(String username, int stars, String comment) {
		account.username=username;
		this.stars=stars;
		this.comment=comment;
		
	}
	
	
	//getters and setters for stars
	
	//getters and setters for reviews
	
	/**
	 * getReview(){
	 * should return string statement with account name, getStars, maybe add a comment/description
	 */
	public String printReview() {
		return "Username: " + account.username + "\nStars: " + this.stars + "\nComment: " +this.comment;
	}
}
