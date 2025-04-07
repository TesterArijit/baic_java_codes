package infy_java;

import java.util.Scanner;

public class Swapping_No {

	public static void main(String[] args) {
		System.out.println("Enter the first number");
		Scanner	 sc =new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Enter the second number");
		int b = sc.nextInt();
		sc.close();
		
		System.out.println("First no before Swapping: "+a);
		System.out.println("Second no before Swapping: "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("First no after Swapping: "+a);
		System.out.println("Second no after Swapping: "+b);
		
		
	}

}
