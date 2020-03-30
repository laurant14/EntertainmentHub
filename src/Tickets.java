public class Tickets extends Show {
	protected Show show;
	protected String time; 
	protected double price;
	
	public Ticket(Show show, String time, double price) {
		this.show = show; 
		this.time = time; 
		this.price = price;
	}

	public Show getShow() {
		return show;
	}

	public String getTime() {
		return time;
	}

	public double getPrice() {
		return price;
	}

	public void setShow(Show show) {
		this.show = show;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public void setPrice(double price) {
		if (this.price >= 0.0)
			this.price = price;
	}
}