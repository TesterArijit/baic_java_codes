package infy_java;

import java.util.Scanner;

public class Sum_od_digits_Of_number {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		int sum=0;
		while(a>0)
		{
			sum=sum+a%10; //extracting the last number.
			a=a/10; // removing last number.
			
		}
		System.out.println("The sum of dights is : "+sum);

	}

}
