package com.jsp;
import java.util.Scanner;
public class Array01 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] a=new int[5];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter the student age");
			a[i]=scan.nextInt();
		}
		System.out.println("The ages are :-");
		for(int i=0;i<a.length;i++)
		{
					System.out.println(a[i]);
		}
	
	}

}
