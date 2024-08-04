package com.basic.Impotant_programme;

import java.util.Scanner;

public class Average_Array1 {
	static double sum;
	static double average;
	public static void main(String[] args) {
		double [] a=new double[4];
	Scanner	sc=new Scanner(System.in);
	System.out.println("Enter the values of Array");
	
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextDouble();
	}
	for(int i=0;i<a.length;i++)
	{
		sum=sum+a[i]; 
	}
	average=sum/4;
	System.out.println("The average value of the given array is : >"+average);
	
	

	}

}
