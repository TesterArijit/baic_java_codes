package Asignment_java;
//Assignment 23 Accept input from user and calculate Circumference of 
//Rectangle formula 2*(a+b).

import java.util.Scanner;

public class Rectangle01 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the length of Rectangle");
		double a=s.nextDouble();
		System.out.println("Enter the width of Rectangle");
		double b=s.nextDouble();
		double peremeter=2*(a+b);
		System.out.println("Peremeter of rectangle is--->> "+peremeter);
		s.close();

	}

}
