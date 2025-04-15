package infy_java;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		sc.close();
		String rev="";
		for(int i=a.length()-1;i>=0;i--)
		{
			rev=rev+a.charAt(i);
		}
		System.out.println("Reverse string is : "+rev);

	}

}
