import java.io.FileReader;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class DataLoader extends DataConstants{
	
	public static ArrayList<Account> loadAccounts() {
		ArrayList<Account> accounts = new ArrayList<Account>();
		
		try {
			FileReader reader = new FileReader(PEOPLE_FILE_NAME);
			JSONParser parser = new JSONParser();
			JSONArray accountsJSON = (JSONArray)new JSONParser().parse(reader);
			
			for(int i=0; i < accountsJSON.size(); i++) {
				JSONObject accountJSON = (JSONObject)accountsJSON.get(i);
				String name = (String)accountJSON.get(ACCOUNTS_NAME);
				String username = (String)accountJSON.get(ACCOUNTS_USERNAME);
				String password = (String)accountJSON.get(ACCOUNTS_PASSWORD);
				
				accounts.add(new Account(name, username, password));
			}
			
			return accounts;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
}