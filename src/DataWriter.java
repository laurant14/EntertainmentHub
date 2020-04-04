import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class DataWriter extends DataConstants {

	public static void saveAccounts() {
		accounts accounts1 = accounts.getInstance();
		ArrayList<Account> friends = accounts1.getAccount();
		JSONArray jsonFriendsACC = new JSONArray();

		// creating the json objects
		for (int i = 0; i < friends.size(); i++) {
			jsonFriendsACC.add(getAccountJSON(friends.get(i)));
		}

		// Writing the JSON file
		try (FileWriter file = new FileWriter(ACCOUNTS_FILE_NAME)) {

			file.write(jsonFriendsACC.toJSONString());
			file.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static JSONObject getAccountJSON(Account account) {
		JSONObject accountDetails = new JSONObject();
		accountDetails.put(ACCOUNTS_NAME, Account.getName());
		accountDetails.put(ACCOUNTS_USERNAME, Account.getUsername());
		accountDetails.put(ACCOUNTS_PASSWORD, Account.getPassword());
		accountDetails.put(ACCOUNTS_ACCTTYPE, Account.getPassword());

		return accountDetails;
	}
}