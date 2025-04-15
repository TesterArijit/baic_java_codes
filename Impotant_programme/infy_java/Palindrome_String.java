package infy_java;

import java.util.Scanner;

public class Palindrome_String {

	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String rev="";
		sc.close();
		for(int i=a.length()-1;i>=0;i--)
		{
			rev=rev+a.charAt(i);
		}
		System.out.println("Reverse string is : "+rev);
		if(a.equals(rev))
		{
			System.out.println(a+" is a palindrome String");
		}
		else
		{
			System.out.println(a+" is not a palindrome string");
		}

	}

}
	