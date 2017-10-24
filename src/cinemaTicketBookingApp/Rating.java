package cinemaTicketBookingApp;

public enum Rating {
	GENERAL(0), PARENTALGUIDANCE(12), MATURE(16);
	private int age;
	
	private Rating(int age)
	{
		this.age = age;
	}
	
	public int getAge()
	{
		return this.age;
	}
	
	public void setAge(int minAge)
	{
		this.age = minAge;
	}
}
