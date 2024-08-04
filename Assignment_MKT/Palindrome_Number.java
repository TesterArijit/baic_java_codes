package Assignment_MKT;

import java.util.Scanner;

public class Palindrome_Number {

	public static void main(String[] args) {
		Scanner	sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		sc.close();
		int Original=a;
		int Reverse=0;
		
		while(a!=0)
		{
			Reverse=Reverse*10+a%10;
			a=a/10;
		}
		//System.out.println(Reverse);
		
		if(Original==Reverse)
		{
			System.out.println("The given number "+Original+" is palindrome number");
		}
		else
		{
			System.out.println("The given number "+Original+" is not palindrome number");
		}
				
	}

}
