package Assignment_MKT;

import java.util.Scanner;

// Assignment 16 Accept two numbers from user and perform all the Arithmetic 
//operations(+, *, /, %) 
public class Scanner01 {

public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter first number");
	double a=s.nextDouble();
	System.out.println("Enter second number");
	double b=s.nextDouble();
	double c=a+b,c2=a-b,c3=a*b,c4=a/b,c5=a%b;
	
	System.out.println("The sum of two number is -->> "+c);
	System.out.println("The sub of two number is -->> "+c2);
	System.out.println("The mult of two number is -->> "+c3);
	System.out.println("The div of two number is -->> "+c4);
	System.out.println("The mod of two number is -->> "+c5);
	
	}

}
