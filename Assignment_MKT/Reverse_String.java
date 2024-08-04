package Assignment_MKT;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
	Scanner	sc=new Scanner(System.in);
	System.out.println("Enter the String");
	String a=sc.next();
	String reverse="";
	for(int i=a.length()-1;i>=0;i--)
	{
		reverse=reverse+a.charAt(i);
				
	}
	System.out.println("Reverse of "+a+" is > "+reverse);
	sc.close();
	}

}
