package com.basic.Impotant_programme;

import java.util.Arrays;
import java.util.Scanner;

public class Checking_arrays_eual_Or_Not {

	public static void main(String[] args) {
		Scanner	sc=new Scanner(System.in);
		int [] a=new int[4];
		int [] b=new int[4];
		System.out.println("Enter the values in array1");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		//System.out.println(Arrays.toString(a));
		
		System.out.println("Enter the values in array2");
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		//System.out.println(Arrays.toString(b));
		
		boolean ans=Arrays.equals(a, b);
		if(ans==true)
		{
			System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("Arrays are not equal");
		}
		sc.close();

	}

}
