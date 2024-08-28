package test.one;
import java.util.Scanner;

class Handle_Exception extends Exception{
	public String getMessagge()
	{
		return "Yoy are under age, Please try again!";
	}
}

class Lisence
{
	private int age2=18;
	private int age3=60;
	private int p;
	
	public void age_factor()
	
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the age");
		p=scan.nextInt();
			}
	
	public void Validate_age() throws Handle_Exception
	{
		if(age2<=p && p<=age3)
		{
			System.out.println("Lisence mubarakho!");
			System.exit(0);
		}
		else {
			Handle_Exception he=new Handle_Exception();
			System.out.println(he.getMessagge());
			throw he;
					
		}
		
	}
}
	class Head_office{
		public void office()
		{
			Lisence li=new Lisence();
			try {
				
				li.age_factor();
				li.Validate_age();
				
			} 
			catch (Handle_Exception e1) {
				try {
					li.age_factor();
					li.Validate_age();
										
				} catch (Exception f) {
					try {
						li.age_factor();
						li.Validate_age();
					} catch (Exception g) {
						System.out.println("Your registration is blocked!");
						System.exit(0);
						
					}
					
				}
			
			}
		}
	}
	

public class Custom02 {

	public static void main(String[] args) {
		Head_office head=new Head_office();
		head.office();
		System.out.println("Try again!");
	
	}

}
