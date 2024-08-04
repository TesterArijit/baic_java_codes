package Assignment_MKT;
import java.util.Scanner;
// Assignment 17 Accept number from user and calculate Area of circle 
//(formula πr square, PI=3.14f) 

public class Math_class01 {
	
	static final double pi=Math.PI;
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the radius of the circle");
		double d=s.nextDouble();
		double area=pi*d*d;
		System.out.println("The area of the circle is -->> "+area);
		
	}

}
