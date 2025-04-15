package infy_java;

import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		int rev=0;
		while(a>0)
		{
			rev=rev*10+a%10;
			a=a/10;
		}
		System.out.println("Reverse number is: "+rev);
	}

}	
