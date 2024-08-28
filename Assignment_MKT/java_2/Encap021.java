package test.one;
import java.util.Scanner;
public class Encap021 {
	private int balance=5000;
	private int p1;
	public void Set_balance(int p1)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter new amount.");
		p1=scan.nextInt();
			
		if(balance<=p1)
		{
			System.out.println("The balance is now :"+p1);
			System.exit(0);
		}
		else
		{
			System.out.println("Invalid amount!");
			System.exit(0);
		}
		
	}
	public int Get_balance()
	{
		return balance;
	}

	public static void main(String[] args) {
		Encap021 en=new Encap021();
		System.out.println(en.Get_balance());
		en.Set_balance(en.p1);
		System.out.println(en.Get_balance());
		//System.out.println("The Current balance is :-"+(en.p1));
		
	}

}
