import java.util.ArrayList;

public class Showlist {

	private static Showlist showsList = null;
	private static ArrayList<Account> ListOfShows = new ArrayList<Account>();
	
	private Showlist() {
		ListOfShows = DataLoader.loadAccounts();

	}
	public static Showlist getInstance() {
		if(showsList == null) {
			showsList = new Showlist();
		}
		
		return showsList;
	}
	
	public ArrayList<Account> getAccount() {
		return ListOfShows;
	}
	
	public void addShow(String firstName, String lastName, String phoneNumber) {
		ListOfShows.add(new Account(firstName, lastName, phoneNumber));
		DataWriter.saveAccounts();
	}
}

