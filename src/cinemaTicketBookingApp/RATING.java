package cinemaTicketBookingApp;

public enum RATING {
	G(0), P(12), M(16);
	private int age;
	
	private RATING(int age)
	{
		this.setRating(age);
	}
	
	public int getRating()
	{
		return this.age;
	}
	
	public void setRating(int minAge)
	{
		this.age = minAge;
	}
}
