package com.basic.Impotant_programme;

import java.util.Scanner;

public class Plaindrom_String {

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
	if(Original.equals(Reverse))
	{
		System.out.println("The String "+a+" is a Plaindrome");
	}
	else
	{
		System.out.println("The String "+a+" is not a Plaindrome");
	}
	sc.close();

	}

}
