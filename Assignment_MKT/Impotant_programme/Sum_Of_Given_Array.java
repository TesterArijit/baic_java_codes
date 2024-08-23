package com.basic.Impotant_programme;

import java.util.Scanner;

public class Sum_Of_Given_Array {
	
	static int[] a=new int[4];
	
	public static void main(String[] args) {
		Scanner	s=new Scanner(System.in);
						
			for(int j=0;j<4;j++)
			{
				System.out.println("Enter the numbers in the array index of "+j);
				a[j]=s.nextInt();
				
			}
//			for(int j=0;j<4;j++)
//			{
//				System.out.println(a[j]);
//			}
		
		int sum=0;
		
		for(int num: a)
		{
			sum=sum+num;
		}
		System.out.println("The sum of given array is > "+sum);
		s.close(); 

	}

}
