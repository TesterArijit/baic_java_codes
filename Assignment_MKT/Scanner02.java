package Assignment_MKT;

import java.util.Scanner;
// Assignment 19 Accept number from user and calculate Area of Triangle.

public class Scanner02 {

public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the base length");
	double a=s.nextDouble();
	System.out.println("Enter the height");
	double b=s.nextDouble();
	double area=0.5*a*b;
	System.out.println("Area of Triangle is -->> "+area);
	
		

	}

}
