import java.util.ArrayList;

public class accounts {

	private static accounts accounts = null;
	private static ArrayList<Account> AccountList = new ArrayList<Account>();
	
	private accounts() {
		AccountList = DataLoader.loadAccounts();

	}
	public static accounts getInstance() {
		if(accounts == null) {
			accounts = new accounts();
		}
		
		return accounts;
	}
	
	public ArrayList<Account> getAccount() {
		return AccountList;
	}
	
	public void addPerson(String firstName, String lastName, String phoneNumber) {
		AccountList.add(new Account(firstName, lastName, phoneNumber));
		DataWriter.saveAccounts();
	}
}
