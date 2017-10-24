package cinemaTicketBookingApp;

public class Film {
	private String filmTitle;
	private Rating Rating;
	
	public Film(String title, Rating rate) {
		this.setTitle(title);
		this.setRating(rate);
	}
	
	public Film(){
		this.filmTitle = "Unknown";
		this.Rating = Rating.GENERAL;
	}
	
	public String getTitle()
	{
		return this.filmTitle;
	}
	
	public void setTitle(String name)
	{
		this.filmTitle = name;
	}
	
	public Rating getRating()
	{
		return this.Rating;
	}
	
	public void setRating(Rating rate)
	{
		this.Rating = rate;
	}
	
	public String toString()
	{
		return this.filmTitle+" ("+this.Rating+")";
	}
}
