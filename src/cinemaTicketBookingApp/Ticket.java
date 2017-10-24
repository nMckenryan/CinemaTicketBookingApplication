package cinemaTicketBookingApp;

import java.text.DecimalFormat;

public final class Ticket{

	private Customer cust = new Customer();
	private Film movie = new Film();

	public Ticket(Customer cust, Film movie) {
		super();
		this.cust = cust;
		this.movie = movie;
	}

	public Ticket() {
		this.cust = new Customer();
		this.movie = new Film();
	}

	double cost() {
		double ticketPrice = 10; //Initial ticket price is $10
		double discount = 0;

		//Ticket price for Customers under 18 is $7
		if(cust.getAge() < 18){ 
			ticketPrice = 7;
		}
		//Students between 10 and 25 get a 15% discount
		if(cust.getStud() == true & cust.getAge() >= 10 & cust.getAge() <= 25){
			discount = 0.15;
		}
		//Students over 25 get a 10% discount
		else if (cust.getStud() == true & cust.getAge() < 25) {
			discount = 0.1;
		}
		//People who are 65+ who are not students get a 7% discount
		if(cust.getStud() == false && cust.getAge() > 64) {
			discount = 0.07;
		}
		ticketPrice -= (ticketPrice * discount);

		return ticketPrice;
	}

	public Customer getCust() {
		return cust;
	}

	public Film getMovie() {
		return movie;
	}

	public String toString() {
		DecimalFormat decimalFormat = new DecimalFormat("0.00");
		return "-------------------------------------------------------------------\n"
		+ "FILM TICKET FOR: " + movie + "\n" + cust 
		+ "\nTOTAL COST: $" + decimalFormat.format(cost())
		+ "\n-------------------------------------------------------------------";
	}

}
