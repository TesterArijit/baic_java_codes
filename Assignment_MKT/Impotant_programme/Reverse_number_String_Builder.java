package com.basic.Impotant_programme;

import java.util.Scanner;

public class Reverse_number_String_Builder {

	public static void main(String[] args) {
	Scanner	s=new Scanner(System.in);
	System.out.println("Enter the number");
	int a=s.nextInt();
	StringBuilder rev;
	
	StringBuilder sb=new StringBuilder();
	sb.append(a);
	rev=sb.reverse();
	System.out.println("The reverse of "+a+" is > "+rev);
	s.close();
	

	}

}
