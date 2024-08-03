package com.basic.Impotant_programme;

import java.util.Scanner;

public class Factorial_Of_Number {

	public static void main(String[] args) {
		Scanner	sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		int fact=1;
		for(int i=1;i<=a;i++)
		{
			fact=fact*i;
		}
		System.out.println("The factorial of "+a+" is > "+fact);

		sc.close();
	}

}
