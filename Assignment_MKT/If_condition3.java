package Assignment_MKT;

import java.util.Scanner;
// Assignment 18 Accept number from user and Write a program to check 
//Number is even or odd by using if else statement.
public class If_condition3 {
	
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number");
	int a=s.nextInt();
	s.close();
	if(a%2==0)
	{
		System.out.println(a+" is even number");
	}
	else
	{
		System.out.println(a+" is odd number");
	}
		
	}

}
