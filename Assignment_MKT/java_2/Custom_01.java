package test.one;
import java.util.Scanner;


class UserException extends Exception{
	
	public String getMessage()
	{
		return "Invalid pin, Try again!";
	}
	
}	
	
class ATM{
	
	
	private int atm_pin=9999;
	private int p;
	
	public void get_pin()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the pin");
		p=scan.nextInt();
	}
	public void validate_pin()throws UserException
	{
		if(atm_pin==p)
		{
			System.out.println("Login Successfull!");
		}
		else {
			
			UserException ue=new UserException();
			System.out.println(ue.getMessage());
			throw ue;
		}
	}
}
class Bank1{
	public void initiate()
	{
		ATM at=new ATM();
		try {
			
			at.get_pin();
			at.validate_pin();
			
		} catch (UserException e) {
			try {
				at.get_pin();
				at.validate_pin();
			} catch (Exception f) {
				try {
					at.get_pin();
					at.validate_pin();
				} catch (Exception g) {
					System.out.println("Card is blocked");
					System.exit(0);
				}
			}
			
		}
	}
	
	
}
	
public class Custom_01 {	

	public static void main(String[] args) {
		Bank1 bank=new Bank1();
		bank.initiate();
		
		

	}

}
