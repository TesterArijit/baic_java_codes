package infy_java;

import java.util.Scanner;

public class Palindrome_Number {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int original=a;
		sc.close();
		int rev=0;
		while(a>0)
		{
			rev=rev*10+a%10;
			a=a/10;
		}
		System.out.println("Reverse no is : "+rev);
		if(original==rev)
		{
			System.out.println(original+" is a palindrome number");
		}
		else
		{
			System.out.println(original+" is not a palindrome number");
		}

	}

}
