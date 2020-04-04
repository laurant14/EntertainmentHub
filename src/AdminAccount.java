
public class AdminAccount extends Account{
	
	public AdminAccount(String name, String username, String password,AccountType acctType) {
		super(name, username, password, acctType);
	}
	
	Account account;
	AccountType accountType;

  public Show addShow(Show show) {
    show = new Show(ShowType type, String name, String time1, String time2, String description,String ratings);
    Show.add(show);
  }
  
  public void removeShow(Show show) {
    
  }
}
