package basic01;

import java.util.Scanner;

public class NumberOf_Digits_in_a_Given_Number {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=s.nextInt();
		
		int count=0;
		
		while(a>0)
		{
			a=a/10;
			count++;
		}
		System.out.println("The count of number is >> "+count);
		
	}

}
