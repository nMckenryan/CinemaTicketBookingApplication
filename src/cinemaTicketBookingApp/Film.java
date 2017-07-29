package cinemaTicketBookingApp;

public class Film {
	String title;
	int rating;
	
	public static void main(String args[]) {
		Film defaultFilm = new Film();
		System.out.println(defaultFilm.toString());
	}
}
