package basic01;
// Plaindrom number === reverse number, same programme.
import java.util.Scanner;

public class Palindrom_number {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=s.nextInt();
		int Original=a;
		int rev=0;
		
		while(a!=0)
		{
			rev=rev*10+a%10;
			a=a/10;
		}
		if(Original==rev)
		{
			System.out.println(rev+ " is palindrom number");
		}
		else
		{
			System.out.println(rev+ " is not palindrom number");
		}
		
	}

}
