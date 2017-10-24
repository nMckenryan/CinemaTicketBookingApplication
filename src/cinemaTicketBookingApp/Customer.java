package cinemaTicketBookingApp;

public class Customer {
	private String customerName;
	private int customerAge;
	private boolean student;

	public Customer(String name, int age, boolean stude) {
		this.customerName = name;
		this.customerAge = age;
		this.student = stude;
	}
	public Customer()
	{
		this.customerName = "Anonymous";
		this.customerAge = 1;
		this.student = false;
	}

	public String getName() {
		return this.customerName;
	}

	public void setName(String name) {
		this.customerName = name;
	}

	public int getAge() {
		return this.customerAge;
	}

	public void setAge(int age) {
		this.customerAge = age;
	}

	public boolean getStud() {
		return this.student;
	}

	public void setStud(boolean student) {
		this.student = student;
	}

	public String toString()
	{
		return "Customer Name: " +this.customerName+ " | Customer Age: " +this.customerAge+ " | Student?: " +this.student;
	}
}