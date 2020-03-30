import java.util.ArrayList;

public class accounts {

	private static accounts accounts = null;
	private static ArrayList<Account> AccountList = new ArrayList<Account>();
	
	private accounts() {
		AccountList = DataLoader.loadaccounts();
	}
	
	
}
