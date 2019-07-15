package emailApp;

public class EmailApp {

	public static void main(String[] args)
	{
		Email em1 = new Email("Amruta","Joshi");
		em1.setalternateEmail("amu@gmail.com");
		System.out.println("Your Alternate Email is :" +em1.getalternateEmail());
		System.out.println("User Information" +em1.ShowInfo());
	}
	

}
