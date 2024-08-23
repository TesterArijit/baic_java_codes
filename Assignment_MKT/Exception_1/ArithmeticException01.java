package Exception_1;

import java.util.Scanner;

public class ArithmeticException01 {

	public static void main(String[] args) {
	Scanner	sc =new Scanner(System.in);
	System.out.println("Enter the numerator");
	int a=sc.nextInt();
	System.out.println("Enter the denominator");
	int b=sc.nextInt();
	
	try {
		double result=a/b;
		System.out.println("The result is :>> "+result);
		
	} catch (ArithmeticException p) {
		System.out.println("Exception handled in catch block.");
		
	}
	}

}
