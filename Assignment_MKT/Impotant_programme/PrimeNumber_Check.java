package com.basic.Impotant_programme;

import java.util.Scanner;

public class PrimeNumber_Check {

	public static void main(String[] args) {
		Scanner	s=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=s.nextInt();
		int count=0;
		
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println(a+" is a prime number");
		}
		else
		{
			System.out.println(a+" is not a prime number");
		}
		s.close();
	}

}
