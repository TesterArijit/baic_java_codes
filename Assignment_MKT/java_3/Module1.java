package com.jsp;
//"Using Scanner Class please execute below problems:
//(Area of circle, Circumferance of circle,
//Area of square, Area of reactangle, Area of trinagle, Area of trepezium,
//Circumferance of square, Circumferance of reactangle, Circumferance of trinagle,
//Circumferance of trepezium)
//Assignment-17
import java.util.Scanner;
public class Module1 {
	public static void Circle()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the radius of circle");
		int a=scan.nextInt();
		double pi=Math.PI;
		double Area=pi*a*a;
		double Circumferance=2*pi*a;
		System.out.println("The area of circle is :"+Area);
		System.out.println("The circumferance of circle is :"+Circumferance);
		System.out.println("  ");
	}
	public static void Square()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the side of square");
		int a=scan.nextInt();
		long Area=a*a;
		long Perimeter=4*a;
		System.out.println("The area of square is :"+Area);
		System.out.println("The peremeter of square is :"+Perimeter);
		System.out.println("  ");
		
	}
	public static void Rectangle()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of rectangle");
		int a=scan.nextInt();
		System.out.println("Enter the width of rectangle");
		int b=scan.nextInt();
		long Area=a*b;
		long Perimeter=2*(a+b);
		System.out.println("The area of rectangle is :"+Area);
		System.out.println("The peremeter of rectangle is :"+Perimeter);
		System.out.println("  ");
	}
	public static void Triangle()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the base of Triangle");
		int a=scan.nextInt();
		System.out.println("Enter the height of Triangle");
		int b=scan.nextInt();
		double Area=0.5*a*b;
		long Perimeter=3*a;
		System.out.println("The area of triangle is :"+Area);
		System.out.println("The peremeter of triangle is :"+Perimeter);
		System.out.println("  ");
			
	}
	public static void Trapezium()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of base1");
		int a=scan.nextInt();
		System.out.println("Enter the length of base2");
		int b=scan.nextInt();
		System.out.println("Enter the height of trapeziod");
		int h=scan.nextInt();
		System.out.println("Enter the side1");
		int c=scan.nextInt();
		System.out.println("Enter the side2");
		int d=scan.nextInt();
		double Area=0.5*(a+b)*h;
		long Perimeter=a+b+c+d;
		System.out.println("The area of trapezium is :"+Area);
		System.out.println("The peremeter of trapezium is :"+Perimeter);
		System.out.println("  ");
	
	}

	public static void main(String[] args) {
		Circle();
		Square();
		Rectangle();
		Triangle();
		Trapezium();
		
		
		
		
		
		
	
	
	
	}
}
