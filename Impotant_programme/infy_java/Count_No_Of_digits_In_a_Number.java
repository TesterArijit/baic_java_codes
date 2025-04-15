package infy_java;

import java.util.Scanner;

public class Count_No_Of_digits_In_a_Number {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		int count=0;
		while(a>0)
		{
			a=a/10;
			count++;
		}
		System.out.println("No of digit is: "+count);
		
	}

}
