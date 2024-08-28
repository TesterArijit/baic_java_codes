package Demo;
import java.util.Scanner;

class UserException extends Exception{
	public String getMessage()
	{
		return "Invallid pin, Try again!";
	}
}


class Atm{
	

	private int pin=7575;
	private int p;
	
	public void get_pin()
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the pin");
		p=scan.nextInt();
	}
	public void Validate()throws UserException
	{
		if(pin==p)
		{
			System.out.println("Login Successfully!");
		}
		else {
			UserException ue=new UserException();
			System.out.println(ue.getMessage());
			throw ue;
			
		}
	}
	
	
}
class Bank extends Atm{
	public void initiate()
	{
		Atm at=new Atm();
		try {
			at.get_pin();
			at.Validate();
			
		} catch (Exception e) {
			
			try {
				
				at.get_pin();
				at.Validate();
			} catch (Exception e2) {
				try {
					
					at.get_pin();
					at.Validate();
				} catch (Exception e3) {
					System.out.println("Card blocked");
					System.exit(0);
					
				}
				
			}
		}
		
	}
}



public class D2 {

 public static void main(String[] args) {
	 Bank bk=new Bank();
	 bk.initiate();
	
	
	
	}

}
