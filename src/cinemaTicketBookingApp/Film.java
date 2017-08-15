package cinemaTicketBookingApp;

public class Film {
	private String filmTitle;
	private RATING rating;
	
	public Film(String title, RATING rate) {
		this.setTitle(title);
		this.setRating(rate);
	}
	
	public Film(){
		this.filmTitle = "Unknown";
		this.rating = RATING.G;
	}
	
	public String getTitle()
	{
		return this.filmTitle;
	}
	
	public void setTitle(String name)
	{
		this.filmTitle = name;
	}
	
	public RATING getRating()
	{
		return this.rating;
	}
	
	public void setRating(RATING rate)
	{
		this.rating = rate;
	}
	
	public String toString()
	{
		return this.filmTitle+" ("+this.rating+")";
	}
}
