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
	
	//needs to look at this
	public void addShow(String type, String name, String time1, String time2, String description,String ratings ) {
		ListOfShows.add(new Show(type, name, time1, time2, description, ratings));
		DataWriter.saveAccounts();
	}
}

