package com.basic.Impotant_programme;

import java.util.Scanner;

// Leave the last digit >> if divide by 10.
//Take the last digit >> if modulas by 10.
public class Reverse_Number {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=s.nextInt();
		s.close();
		int rev =0;
		while(a!=0)
		{
			rev =rev*10+a%10;
			a=a/10;
		}
		System.out.println("The reverse number is  > "+rev);
		

	}

}
