package com.basic.Impotant_programme;

import java.util.Scanner;

public class SumOf_digits_In_GivenNumber {

	public static void main(String[] args) {
	Scanner	s=new Scanner(System.in);
	System.out.println("Enter the number");
	int a=s.nextInt();
	int Original =a;
	int sum=0;
	
	for(int i=a;i>=0;i--)
	{
		int num=a%10;
		sum=sum+num;
		a=a/10;
	}
	System.out.println("The sum of digits of a the given number "+Original+" is > "+sum);
	s.close();
	
	}

}
