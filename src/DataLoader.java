import java.io.FileReader;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class DataLoader extends DataConstants{
	
	public static ArrayList<Account> loadAccounts() {
		ArrayList<Account> accounts = new ArrayList<Account>();
		ArrayList<Account> showslist = new ArrayList<Account>();

		try {
			FileReader reader = new FileReader(ACCOUNTS_FILE_NAME);
			FileReader reader2 = new FileReader(SHOWSLIST_FILE_NAME);
			JSONParser parser = new JSONParser();
			JSONArray accountsJSON = (JSONArray)new JSONParser().parse(reader);
			JSONArray showslistJSON = (JSONArray)new JSONParser().parse(reader);

			for(int i=0; i < accountsJSON.size(); i++) {
				//for accounts
				JSONObject accountJSON = (JSONObject)accountsJSON.get(i);
				String name = (String)accountJSON.get(ACCOUNTS_NAME);
				String username = (String)accountJSON.get(ACCOUNTS_USERNAME);
				String password = (String)accountJSON.get(ACCOUNTS_PASSWORD);
				String acctType = (String)accountJSON.get(ACCOUNTS_ACCTTYPE);
				//for shows
				JSONObject showsJSON = (JSONObject)showslistJSON.get(i);
				String showType = (String)showslistJSON.get(SHOWLIST_TYPE);
				String showName = (String)showslistJSON.get(SHOWLIST_NAME);
				String time1 = (String)showslistJSON.get(SHOWLIST_TIME1);
				String time2 = (String)showslistJSON.get(SHOWLIST_TIME2);
				String description = (String)showslistJSON.get(SHOWLIST_DESCRIPTION);
				String rating = (String)showslistJSON.get(SHOWLIST_RATINGS);
				//add to both lists
				accounts.add(new Account(name, username, password, acctType));
				//needs to be checked
				showslist.add(new Show(showType,showName,time1,time2,description, rating));
			}
			
			return accounts;
			return showslist;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
}