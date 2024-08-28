package com.jsp;
import java.util.Scanner;
public class Add {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter first number :-");
		int a=scan.nextInt();
		System.out.println("Enter second number :-");
		int b=scan.nextInt();
		int c=a+b;
		System.out.println("The sum is :- "+c);
		int c1=a-b;
		int c2=a*b;
		int c3=a/b;
		System.out.println("The sub is :- "+c1);
		System.out.println("The sub is :- "+c2);
		System.out.println("The sub is :- "+c3);
		
		
		

	}

}
