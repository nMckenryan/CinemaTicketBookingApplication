package cinemaTicketBookingApp;

public class Customer {
	String customerName;
	int customerAge;
	boolean student;
	
	
	public static void main(String args[]) {
		Customer defaultCustomer = new Customer();
		System.out.println(defaultCustomer.toString());
	}
}
