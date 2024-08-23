package com.basic.Impotant_programme;

import java.util.Arrays;

public class ShortingOfArray {

	public static void main(String[] args) {
		int [] a=new int [4];
		a[0]=15;
		a[1]=6;
		a[2]=10;
		a[3]=25;
		System.out.println("The values of Array are :.> "+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("The sorted values of the given array is : >> "+Arrays.toString(a));
		
		
		}

}
