package Assignment_MKT;
// Assignment 21 Accept number from user and calculate Circumference of circle.

import java.util.Scanner;

public class Scanner04 {
	static final double pi=Math.PI;
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the radius of the circle");
	double d=s.nextDouble();
	double cir=2*pi*d;
	System.out.println("The Circumference of circle is -->> "+cir);
	
		

	}

}
