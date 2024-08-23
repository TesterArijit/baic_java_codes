package com.basic.Impotant_programme;

import java.util.Arrays;
import java.util.Scanner;

public class ShortingOfArray1 {

	public static void main(String[] args) {
	Scanner	sc=new Scanner(System.in);
	int [] a=new int[4];
	System.out.println("Enter the values of array");
	
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("The values of the array are : >> "+Arrays.toString(a));
	Arrays.sort(a);
	System.out.println("The sorted values of the array are : >> "+Arrays.toString(a));
	sc.close();
	
	
	

	}

}
