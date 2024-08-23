package com.basic.Impotant_programme;

import java.util.Scanner;

public class Min_Max_finding_In_a_GivenArray1 {

	public static void main(String[] args) {
	Scanner	sc=new Scanner(System.in);
	int [] a=new int[4];
	
	int max=a[0];
		
	System.out.println("Enter the values in Array");
// Finding the maximum value in a given array	
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>max)
		{
			max=a[i];
		}
	}
	System.out.println("The maximum value in the given array is :>> "+max);
	
//	 Finding the minimum value in a given array	
	int min=a[0];
	
	for(int i=0;i<a.length;i++)
	{
		if(a[i]<min)
		{
			min=a[i];
		}
	}
	System.out.println("The minimum value in the given array is :>> "+min);
	

	}

}
