package com.basic.Impotant_programme;

import java.util.Scanner;

public class NumberOf_digits_In_GivenNumber {

	public static void main(String[] args) {
		Scanner	s=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=s.nextInt();
		int Original=a;
		int count=0;
		
		while(a>0)
		{
			int num=a%10;
			count++;
			a=a/10;
		}
		System.out.println("The numbrer of digits in "+Original+" is > "+count);
		s.close();
				
	}

}
