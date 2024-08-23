package Asignment_java;
// Assignment 22 Accept number from user and calculate Circumference of triangle.

import java.util.Scanner;

public class Triangle01 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the length of side1");
	double a=s.nextDouble();
	System.out.println("Enter the length of side2");
	double b=s.nextDouble();
	System.out.println("Enter the length of side3");
	double c=s.nextDouble();
	double circum=a+b+c;
	System.out.println("Circumference of triangle is -->> "+circum);
	s.close();

	}

}
