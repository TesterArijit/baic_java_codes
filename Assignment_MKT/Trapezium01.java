package Asignment_java;

import java.util.Scanner;

// Assignment 24 Accept input from user and calculate area of trapezium
//(formula -> 1/2*(a+b)*h
public class Trapezium01 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Basse1");
		double a=s.nextDouble();
		System.out.println("Enter the Basse2");
		double b=s.nextDouble();
		System.out.println("Enter the Height");
		double h=s.nextDouble();
		s.close();
		double area=0.5*(a+b)*h;
		System.out.println("The area of  trapezium is --->> "+area);
	
	}

}
