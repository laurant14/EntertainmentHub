import java.util.Scanner;
import java.util.*;
public class DriverHelper {
	
	Scanner key=new Scanner(System.in);
	
	EntertainmentHub entHub=new EntertainmentHub();

	public Account logIn(Account account) {
		System.out.println("1) Login or 2) Continue as guest");
		int answer=key.nextInt();
		switch(answer) {
		case 1:
			System.out.println("Enter your username: ");
			String username=key.next();
			System.out.println("Enter your password: ");
			String password=key.next();
			account.loginAccount(username, password);
			System.out.println("Logging in...\nWhat would you like to do next?");//check to make sure checking for account
			break;
		case 2:
			System.out.println("Continuing as guest...");	
		}
		return account;
	}
	public Account createAccount(Account account) {
		System.out.println("Enter your full name: ");
		String name=key.next();
		System.out.println("Enter a username: ");
		String userName=key.next();
		System.out.println("Enter a password: ");
		String passWord=key.next();
		System.out.println("Enter an account type: Student, Adult, Teacher, Senior, Guest, or Veteran");
		AccountType acctType=getAccountType(key.next());
		System.out.println(acctType);
		account.addAccount(name, userName, passWord, acctType);//make sure its adding it to the arrayList of accounts
		return account;
	}
	
	public AccountType getAccountType(String string) {
		if(string.equalsIgnoreCase("student")) {
			return AccountType.Student;
		}
		else if(string.equalsIgnoreCase("adult")) {
			return AccountType.Adult;
		}
		else if(string.equalsIgnoreCase("teacher")) {
			return AccountType.Teacher;
		}
		else if(string.equalsIgnoreCase("senior")) {
			return AccountType.Senior;
		}
		else if(string.equalsIgnoreCase("guest")) {
			return AccountType.Guest;
		}
		else if(string.equalsIgnoreCase("veteran")) {
			return AccountType.Veteran;
		}
		else {
			return null;
		}
	}
	
	public Tickets buyTickets() {
		System.out.println("Here are the list of venues: ");
		//pick venue
		System.out.println("Do you want to buy tickets for a 1) play, 2) movie, or 3) concert?");
		int selection=key.nextInt();
		System.out.println("Select one of the following: ");
		if(selection==1) {
			entHub.getPlays();
		}
		else if(selection==2) {
			entHub.getMovies();
		}
		else if(selection==3) {
			entHub.getConcerts();
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
		return null;
	}
	
	public void view() {
		System.out.println("Would you like to view 1) movies, 2) plays, or 3) concerts?");
		int Choice=key.nextInt();
		if(Choice==1) {
			entHub.getMovies();
			//somehow be able to go back 
		}
		else if(Choice==2) {
			entHub.getPlays();
			//somehow be able to go back to options
		}
		else if(Choice==3) {
			entHub.getConcerts();
			//go back to options
		}
		else {
			System.out.println(Choice + " wasn't one of the above options!");
		}
	}
	

	public void writeReview() {
		Event event=new Event();//fix later
		System.out.println("Which show would you like to review?");
		String rev=key.next();
		//figure out how to link show to review
		event.setName(rev);
		System.out.println("Enter Username: ");
		String userName1=key.next();
		System.out.println("Enter stars from 1-5: ");
		int stars=key.nextInt();
		System.out.println("Enter comment: ");
		String comment=key.nextLine();
		Reviews rev1=new Reviews(userName1, stars, comment);
		event.setReviews(event.getName(), rev1);
		rev1.printReview();
		
	}
	
	public void displayMainMenu() {
		System.out.println("What would you like to do?\n"
				+ "1) Create Account\n"
				+ "2) Buy Ticket\n"
				+ "3) Browse Shows\n"
				+ "4) Write a Review\n"
				+ "5) Quit");
	}
	
	
	
	public void runSim() {
		Account account=new Account();
		//while loop to keep running
		logIn(account);
		while(true) {
			displayMainMenu();
			int choice=key.nextInt();
			switch(choice) {
			case 1:
				account=createAccount(account);
				break;
			case 2:
				buyTickets();
				break;
			case 3:
				view();
				break;
			case 4:
				writeReview();
				break;
			case 5:
				System.out.println("Goodbye!");
				return;
			default:
				System.out.println("Invalid input, enter a number from 1-6!");
			}
			
		}
	}

}
