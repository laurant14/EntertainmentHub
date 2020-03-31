public class Reviews {
	Account account;
	protected int stars;
	protected String review;
	protected String comment;
	
	public Reviews(String username, int stars, String comment, String review) {
		account.username=username;
		this.stars=stars;
		this.review = review;
		this.comment=comment;	
	}
	
	public Reviews() {

	}

	public int getStars() {
		return this.stars;
	}
	
	public String getReview() {
		return this.review;
	}
	
	public String getComment() {
		return this.comment;
	}
	
	public Account getAccount() {
		return this.account;
	}
	
	public void setStars(int stars) {
		if (this.stars >= 1 && this.stars <= 5)
			this.stars = stars;
	}
	
	public void setReview(String review) {
		this.review = review;
	} 
	
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	//getReview from UML is now this printReview 
	public String printReview() {
		return "Username: " + account.username + "\nStars: " + this.stars + "\nComment: " +this.comment;
	}
}
