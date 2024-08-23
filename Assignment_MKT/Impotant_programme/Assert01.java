package com.basic.Impotant_programme;

import java.util.Scanner;

public class Assert01 {
	public static void ValidateAge(String name,int age)
	{
		assert age>0 && age <100 : "Age must be between 0 and 100";
		System.out.println("The age of "+name+" is : "+age);
		
	}

	public static void main(String[] args) {
	Scanner	sc=new Scanner(System.in);
	System.out.println("Enter the name");
	String name=sc.next();
	System.out.println("Enter the age");
	int age=sc.nextInt();
	ValidateAge(name,age);
	
	}

}
