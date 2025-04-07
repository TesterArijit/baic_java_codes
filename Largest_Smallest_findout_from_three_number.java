package infy_java;

import java.util.Scanner;

public class Largest_Smallest_findout_from_three_number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();
		System.out.println("Enter third number");
		int c = sc.nextInt();
		sc.close();
		if(a>b && a>c)
		{
			System.out.println(a+" is bigger number");
		}
		if(b>a && b>c)
		{
			System.out.println(b+" is bigger number");
		}
		if(c>b && c>a)
		{
			System.out.println(c+" is bigger number");
		}
		if(a<b && a<c)
		{
			System.out.println(a+" is smaller number");
		}
		if(b<a && b<c)
		{
			System.out.println(b+" is smaller number");
		}
		if(c<b && c<a)
		{
			System.out.println(c+" is smaller number");
		}
		
		
		

	}

}
