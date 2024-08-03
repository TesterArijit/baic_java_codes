package com.basic.Impotant_programme;

import java.util.Scanner;

// Progmram is same as Reverse number
public class Plaindrom_Number {

	public static void main(String[] args) {
		Scanner	s=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=s.nextInt();
		int rev=0;
		int Original_number=a;
		while(a>0)
		{
			rev =rev*10+a%10;
			a=a/10;
		}
		if(rev==Original_number)
		{
			System.out.println(Original_number+" is a palindrom number");
		}
		else
		{
			System.out.println(Original_number+" is not a palindrom number");
		}
		s.close();

	}

}
