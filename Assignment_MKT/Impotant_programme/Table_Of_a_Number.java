package com.basic.Impotant_programme;

import java.util.Scanner;

public class Table_Of_a_Number {

	public static void main(String[] args) {
		Scanner	sc=new Scanner(System.in);
		int table;
		int sum=0;
		System.out.println("Enter a number");
		int a=sc.nextInt();
		System.out.println("Table of "+a+" is :>");
		for(int i=1;i<=10;i++)
		{
			table=a*i;
			System.out.println(a+"x"+i+"= "+table);
			sum=sum+table;
			
		}
		System.out.println("The sum of results of table "+a+" is > "+sum);
		
		
		

	}

}
