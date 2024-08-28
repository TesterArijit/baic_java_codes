package basic01;

import java.util.Scanner;

// Using the concept of String builder.
public class Reverse_number_StringBuffer {

	public static void main(String[] args) {
		Scanner	s=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=s.nextInt();
		StringBuffer rev;
		s.close();
		//Use to convert the integer value into string format
		StringBuffer sb=new StringBuffer(String.valueOf(a));
		rev=sb.reverse();
		System.out.println("The reverse value of the number is >> "+rev);
		
		

	}

}
