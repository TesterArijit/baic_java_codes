package com.basic.Impotant_programme;

import java.util.Arrays;
import java.util.Scanner;

public class Copy_One_Array_Into_Another_Array {

	public static void main(String[] args) {
		int [] a=new int[4];
		int [] b=new int[4];
		Scanner	sc=new Scanner(System.in);
		System.out.println("Enter the values of the Array1");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		System.out.println("The values of Array1 is: >>"+Arrays.toString(a));
		System.out.println("The values of Array2 is: >>"+Arrays.toString(b));
		sc.close();
			
	}

}
