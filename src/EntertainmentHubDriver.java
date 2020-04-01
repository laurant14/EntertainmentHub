import java.util.Scanner;
public class EntertainmentHubDriver {
	Scanner key=new Scanner(System.in);

	
	public void runSim() {
		Account account=new Account();
		Event event;
		//while loop to keep running
		int answer=key.nextInt();
		System.out.println("1) Login or 2) Continue as guest");
		switch(answer) {
		case 1:
			System.out.println("Enter your username: ");
			String username=key.nextLine();
			System.out.println("Enter your password: ");
			String password=key.nextLine();
			account.loginAccount(username, password);
			break;
		case 2:
			System.out.println("Continuing as guest...");
			break;
		}
		
		System.out.println("What would you like to do?\n"
				+ "1) Login"
				+ "2) Create Account"
				+ "3) Buy Ticket"
				+ "4) Browse Shows"
				+ "5) Write a Review");
		int choice=key.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter your username: ");
			String username=key.nextLine();
			System.out.println("Enter your password: ");
			String password=key.nextLine();
			account.loginAccount(username, password);
			break;
		case 2:
			System.out.println("Enter your full name: ");
			String name=key.nextLine();
			System.out.println("Enter a username: ");
			String userName=key.nextLine();
			System.out.println("Enter a password: ");
			String passWord=key.nextLine();
			System.out.println("Enter an account type: Student, Adult, Teacher, Senior, Guest, or Veteran");
			AccountType acctType=key.nextAccountType();//figure this out
			account.addAccount(name, userName, passWord, acctType);
		case 3:
			System.out.println("Do you want to buy tickets for a 1) play, 2) movie, or 3) concert?");
			int selection=key.nextInt();
			System.out.println("Select one of the following: ");
			if(selection==1) {
				//getShows()
				//getPlays() ---json
			}
			else if(selection==2) {
				//getShows()
				//getMovies()
			}
			else if(selection==3) {
				//getShows()
				//getConcerts()
			}
			else {
				System.out.println(selection + " wasn't an option");
			}
			System.out.println("Enter your choice: ");
			String showChoice=key.nextLine();
			System.out.println("Availibility for your show is: ");
			//figure out how to display showtimes for their specific show
			//select the ticket+quantity
			//display price
			//have option to print tickets
			break;
			
		case 4:
			System.out.println("Would you like to view 1) movies, 2) plays, or 3) concerts?");
			int Choice=key.nextInt();
			if(Choice==1) {
				//getMovies()
				//somehow be able to go back 
			}
			else if(Choice==2) {
				//getPlays()
				//somehow be able to go back to options
			}
			else if(Choice==3) {
				//getConcerts()
				//go back to options
			}
			else {
				System.out.println(Choice + " wasn't one of the above options!");
			}
			break;
		case 5:
			System.out.println("Which show would you like to review?");
			String rev=key.nextLine();
			//figure out how to link show to review
			event.setName(rev);
			System.out.println("Enter Username: ");
			String userName1=key.nextLine();
			System.out.println("Enter stars from 1-5: ");
			int stars=key.nextInt();
			System.out.println("Enter comment: ");
			String comment=key.nextLine();
			Reviews rev1=new Reviews(userName1, stars, comment);
			event.setReviews(event.getName(), rev1);
			rev1.printReview();
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to Entertainment Hub!");
		
		

	}

}
