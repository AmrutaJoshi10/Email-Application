package emailApp;

import java.util.*;


public class Email 
{
	private String FirstName;
	private String LastName;
	private String password;
	private String emailAddress;
	private String department;
	private int mailboxcapacity = 500;
	private int defaultPasswordLength = 10;
	private String companySuffix = "company.com";
	private String alternateEmailAddress;
	
	public Email(String firstName, String lastName)
	{
		this.FirstName = firstName;
		this.LastName = lastName;
//System.out.println("Email Created:" +this.FirstName+ this.LastName );
		
	this.department = setDepartment();
	System.out.println("Department Created:" +this.department);
	this.password = randomPassword(defaultPasswordLength);
	System.out.println("Password Created:" +this.password);
	
	emailAddress = firstName.toLowerCase() + "." + lastName.toLowerCase()+  "@" + department + "." +companySuffix; 
//	System.out.println("Your email is" +emailAddress);
	}
	
	private String setDepartment()
	{
	System.out.println("New Worker : "+FirstName+ " " +"\n"+ "Enter the department\n1 Sales\n2 Development\n3 Accounting");
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the department code");
	int depChoice = sc.nextInt();
	if(depChoice == 1)
	{
		return "sales";
	}
	else if(depChoice == 2)
	{
		return "development";
	}
	else if(depChoice == 3)
	{
		return "Accounting";
	}

	
	return "";

}



private String randomPassword(int length) 
{
	String passwordSet ="ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$%";
	char [] password = new char[length];
	for(int i =0 ; i< length; i++)
	{
	int rand =	(int)(Math.random() * passwordSet.length());
	password[i] = passwordSet.charAt(rand);
	}
	return new String(password);
}

//Set the mailbox capacity
public void setMailBoxCapacity(int capacity)
{
	this.mailboxcapacity = capacity;
}

//Set the alternateEmail
public void setalternateEmail(String altEmail)
{
	this.alternateEmailAddress = altEmail;
}

//Change the password set method
public void changePassword(String chanpassword)
{
	this.password = chanpassword;
}

public int getMailBoxCapacity() {
	return mailboxcapacity;
}

public String getalternateEmail()
{
	return alternateEmailAddress;
	
}

public String getChangePassword()
{
	return password;
}

public String ShowInfo()
{
	return "\nDISPLAY NAME : " +FirstName + " " +LastName +
			"\nCOMPANY EMAIL : "  + emailAddress + 
			"\nMAILBOX CAPACITY :" +mailboxcapacity + "mb";
			
}

}
