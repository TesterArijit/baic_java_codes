package com.basic.Impotant_programme;

import java.util.Scanner;

public class Checking_GivenNumber_PartOfArrayOrNot {

	public static void main(String[] args) {
		int [] a=new int[4];
		int Given_Number=50;
		int count=0;
		Scanner	sc=new Scanner(System.in);
		System.out.println("Enter the values in the array");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
		for(int i=0;i<a.length;i++)
		{
			if(Given_Number==a[i])
			{
				count++;
				System.out.println("the index of the number is "+i);
			}
			
		}
		if(count==1)
		{
		
			System.out.println("Given number is a part of array");
		}
		else 
		{
			System.out.println("Given number is not a part of array");
		}
			
	}

}
