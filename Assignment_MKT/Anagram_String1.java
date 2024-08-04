package Assignment_MKT;
// Assignment 45  WAP to demonstrate that  two Strings are anagram to each other

import java.util.Arrays;
import java.util.Scanner;

public class Anagram_String1 {

	public static void main(String[] args) {
	Scanner	sc=new Scanner(System.in);
	System.out.println("Enter the String1");
	String a=sc.next();
	String First =a;
	System.out.println("Enter the String2");
	String b=sc.next();
	String Second =b;
	
	if(a.length()!=b.length())
	{
		System.out.println("Not Anagram");
	}
	else
	{
		char [] c = a.toCharArray();
		char [] c1= b.toCharArray();
		
		Arrays.sort(c);
		Arrays.sort(c1);
		
//		System.out.println(Arrays.toString(c));
//		System.out.println(Arrays.toString(c1));
		
		boolean ans=Arrays.equals(c, c1);
		
		if(ans==true)
		{
			System.out.println("Two Strings are anagram to each other");
		}
		else
		{
			System.out.println("Two Strings are not anagram to each other");
		}
			
	}
	
	}

}
