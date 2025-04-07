package infy_java;

import java.util.Scanner;

public class Table_of_Number {

	public static void main(String[] args) {
		Scanner	sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		int c;
		for(int i=1;i<=10;i++)
		{
			c=a*i;
			System.out.println(a+" x "+i+" = "+c);
		}
		sc.close();
	}

}
