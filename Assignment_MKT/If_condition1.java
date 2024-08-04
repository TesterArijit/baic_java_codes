package Assignment_MKT;

import java.util.Scanner;

// "Assignment 14 
//WAP if age is greater than equals to 18 then you can vote
//else you can not vote"
public class If_condition1 {

public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the age");
	int age=s.nextInt();
	s.close();
	if(age>=18)
	{
		System.out.println("Eligible for vote");
	}
	else
	{
		System.out.println("Not eligible for vote");
	}
	
		

	}

}
