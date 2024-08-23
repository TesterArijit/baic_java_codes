package com.basic.Impotant_programme;

import java.util.Scanner;

public class Given_number_Count_Even_Odd {
	public static void main(String[] args) {
		Scanner	s=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=s.nextInt();
		int Even_Count=0;
		int Odd_Count=0;
		
		while(a>0)
		{
			int num=a%10;
			if(num%2==0)
			{
				Even_Count++;
			}
			else
			{
				Odd_Count++;
			}
			
			a=a/10;
		}
		System.out.println("In the given number "+a+" the count of even number is >"+Even_Count);
		System.out.println("In the given number "+a+" the count of odd number is >"+Odd_Count);
		s.close();
	}
	

}
