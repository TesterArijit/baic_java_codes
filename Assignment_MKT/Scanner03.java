package Assignment_MKT;
//Assignment 20 Accept number from user and calculate Area of Rectangle

import java.util.Scanner;

public class Scanner03 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the length of rectangle");
		double a=s.nextDouble();
		System.out.println("Enter the width of rectangle");
		double b=s.nextDouble();
		double area=a*b;
		System.out.println("Area of Rectangle is -->> "+area);

	}

}
