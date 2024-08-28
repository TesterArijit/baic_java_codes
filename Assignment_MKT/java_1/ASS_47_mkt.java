package basic01;

import java.util.Scanner;

// WAP with an Array of size 4, enter five values in it and handle the
//Exception?

public class ASS_47_mkt {

	public static void main(String[] args) {
		
		int [] a =new int[4];
	Scanner	sc=new Scanner(System.in);
	System.out.println("Enter the values in the array");
	
	try {
		
		for(int i=0;i<=a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
	} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println(" java.lang.ArrayIndexOutOfBoundsException handled successfully!");
		
	}
		

	}

}
