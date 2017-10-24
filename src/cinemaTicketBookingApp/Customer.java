package cinemaTicketBookingApp;

public class Customer {
	private String customerName;
	private int customerAge;
	private char student;
	
	public Customer(String name, int age, char stude) {
		this.setName(name);
		this.setAge(age);
		this.setStud(stude);
	}
	public Customer()
	{
		this.customerName = "Anonymous";
		this.customerAge = 1;
		this.student = 'N';
	}
	
	public String getName()
	{
		return this.customerName;
	}
	
	public void setName(String name)
	{
		this.customerName = name;
	}
	
	public int getAge()
	{
		return this.customerAge;
	}
	
	public void setAge(int age)
	{
		this.customerAge = age;
	}
	
	public char getStud()
	{
		return this.student;
	}
	
	public void setStud(char student)
	{
		this.student = student;
	}
	
	public String toString()
	{
		return "Customer Name: " +this.customerName+ " Customer Age: " +this.customerAge+ " Student?: " +this.student;
	}
}