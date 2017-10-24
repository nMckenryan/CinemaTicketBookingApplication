package cinemaTicketBookingApp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CinemaTicketBookingApplication {

	private static Scanner input = new Scanner(System.in);
	private static final int NUMBER_OF_FILMS = 4;
	private static Film[] filmList = new Film[NUMBER_OF_FILMS];

	private static Customer customer = new Customer();
	Film desiredFilm = new Film();

	//ENTERING AND VALIDATING CUSTOMER DETAILS
	private static Customer customerDetailsInput() {
		String custName = "";
		int custAge = -1;
		char custStud = 'Z';

		//Ensures a Name is entered.
		do{
			System.out.println("Enter your Name: ");
			custName = input.nextLine();
		}
		while(custName.isEmpty());
		customer.setName(custName);

		System.out.println("Enter your Age: ");
		try {
			custAge = input.nextInt();
		}
		catch(InputMismatchException error) {
			System.out.println("Please enter Numbers only!");
			System.err.println("Exceptional Event: " + error);
			input.next();
		}

		//Validating Age
		while(custAge < 0 || custAge > 130 || custAge != (int)custAge)
		{
			custAge = -1;
			System.out.println("Please enter a valid Age: ");
			custAge = input.nextInt();
		}
		customer.setAge(custAge);

		//Checks if customer is a student
		do{
			System.out.println("Are you a student? (Type Y or N): ");
			custStud = input.next().charAt(0);
			custStud = Character.toLowerCase(custStud);
			if(custStud == 'y') {
				customer.setStud(true);
			}
			else if(custStud == 'n') {
				customer.setStud(false);
			}
		}
		while (custStud != 'y' && custStud != 'n');
		return customer;
	}
	//SELECTING THE FILM
	private static Film filmSelection() {	
		for(int count = 0; count < NUMBER_OF_FILMS; count++){
			System.out.println((count + 1) + ". " + filmList[count]);
		}
		System.out.println("Which film would you like to watch?");
		int selection = input.nextInt();
		selection -= 1;

		if(selection > NUMBER_OF_FILMS | selection < 0)
		{
			System.out.println("Invalid number entered.");
			filmSelection();
		}

		return filmList[selection];

	}
	//ISSUING THE TICKET
	private static Ticket issueTicket(Customer aCustomer, Film aFilm) {
		Ticket ticket = new Ticket(aCustomer, aFilm);
		//Makes sure the customer is old enough to view the movie.
		if (aCustomer.getAge() >= aFilm.getRating().getAge()) {
			return ticket;
		}
		else {
			System.out.println("Sorry, You are not old enough to see this film. \n");
			return null;
		}
	}


	public static void main(String args[]) {

		//Hardcoding the list of available films
		Film antman = new Film("Ant-Man", Rating.PARENTALGUIDANCE);
		Film minions = new Film("Minions", Rating.PARENTALGUIDANCE);
		Film jurassic = new Film("Jurassic World", Rating.MATURE); 
		Film inside = new Film("Inside Out", Rating.GENERAL);

		filmList[0] = antman;
		filmList[1] = minions;
		filmList[2] = jurassic;
		filmList[3] = inside;

		//Recursion for issuing another ticket
		boolean purchaseLoop = true;
		do {
			System.out.println(issueTicket(customerDetailsInput(), filmSelection()));
			char purchaseAgain = '0';
			while(purchaseAgain != 'Y' && purchaseAgain != 'N') {
				System.out.println("Would you like to purchase another ticket? (Y / N)");
				purchaseAgain = input.next().charAt(0);
				purchaseAgain = Character.toUpperCase(purchaseAgain);
				if(purchaseAgain == 'N') {
					System.out.println("Goodbye!");
					purchaseLoop = false; //Closes the loop and the program.
				}	
				else if(purchaseAgain == 'Y') {
					continue; //Loops the program
				}
			}

		}
		while(purchaseLoop);
		System.exit(0);
	}		

}
