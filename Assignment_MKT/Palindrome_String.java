package Assignment_MKT;

import java.util.Scanner;

// WAP to find the given string is palindrome or not.

public class Palindrome_String {

	public static void main(String[] args) {
		Scanner	sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String a=sc.next();
		String Original=a;
		String Reverse="";
		
		for(int i=a.length()-1;i>=0;i--)
		{
			Reverse=Reverse+a.charAt(i);
		}
		if(Reverse.equals(Original))
		{
			System.out.println("The given String "+a+" is plaindrome");
		}
		else
		{
			System.out.println("The given String "+a+" is not plaindrome");
		}
		sc.close();
	
	}

}
