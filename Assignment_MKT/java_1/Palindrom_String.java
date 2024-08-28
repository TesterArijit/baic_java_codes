package basic01;

import java.util.Scanner;

public class Palindrom_String {

	public static void main(String[] args) {
	Scanner	sc=new Scanner(System.in);
	System.out.println("Enter the String");
	String a=sc.next();
	String rev="";
	
		for(int i=a.length()-1;i>=0;i--)
		{
			rev=rev+a.charAt(i);
		}
		if(a.equals(rev))
		{
			System.out.println(a+" is a palindrom string");
		}
		else
		{
			System.out.println(a+" is not a palindrom string");
		}
		sc.close();

	}

}
