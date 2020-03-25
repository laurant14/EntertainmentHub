public class Account {
	protected String username;
	protected String password;
	protected String name;
	protected String cardType;
	protected int cardNum;
	protected int pin;
	protected double expDate;
	
	private Account[] account = new Account[1];
	int count;
	double discount;

	public Account(String name, String username, String password) {
		this.name = name;
		this.username = username; 
		this.password = password;
	}

	public void addAccount(String name, String username, String password) {
		if(count >= account.length) {
			account = growArray(account);
		}
		Account account01 = new Account(name, username, password);
		account[count] = account01;
		count++;
	}
	
	public Account[] growArray(Account[] first) {
		Account[] array = new Account[first.length + 5];
		for(int i=0; i < first.length; i++) {
			array[i] = first[i];
		}
		return array;
	}

	// not correct - ask prof!
	public void deleteAccount(String username, String password) {
		for(int i = 0; i < account.length; i++) {
			if(username == this.username) {
				if(password == this.password) {
					
				}
			}
		}
	}

	// not correct - ask prof!
	public boolean loginAccount(String username, String password) {
		for(int i = 0; i < account.length; i++) {
			if(username == this.username) {
				if(password == this.password) {
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		}
		return true;
	}

	public void addPayment(String cardType, String name, int cardNum, int pin, double expDate) {
		this.cardType = cardType; 
		this.name = name;
		this.cardNum = cardNum;
		this.pin = pin; 
		this.expDate = expDate;
	}

	public double getDiscount() {
		return this.discount;
	}
	public void setDiscount(double percent) {
		this.discount = percent;
	}
	
	// not correct - ask prof and fix!
	public boolean isDisabled() {
		boolean isTrue = true; 
		if (isTrue == true) {
			return true;
		} else {
			return false;
		}
	}
}
