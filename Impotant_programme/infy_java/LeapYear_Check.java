package infy_java;

import java.util.Scanner;

public class LeapYear_Check {

	public static void main(String[] args) {
		
		Scanner	sc=new Scanner(System.in);
		System.out.println("enter the year");
		int a=sc.nextInt();
		if((a%400==0) || (a%4==0 && a%100!=0))
		{
			System.out.println(a+" is a leap year");
		}
		else
		{
			System.out.println(a+" is not a leap year");
		}
		sc.close();
		
	}

}
