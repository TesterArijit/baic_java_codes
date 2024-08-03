package com.basic.Impotant_programme;

import java.util.Scanner;

public class Reverse_number_String_Buffer {

	public static void main(String[] args) {
	Scanner	s=new Scanner(System.in);
	System.out.println("Enter the number");
	int a=s.nextInt();
	StringBuffer rev;
		
	StringBuffer sb=new StringBuffer(String.valueOf(a));
	rev=sb.reverse();
	System.out.println("The reverse number is > "+rev);
	s.close();
	

	}

}
