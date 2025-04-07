package infy_java;

import java.util.Arrays;
import java.util.Scanner;

public class Check_Array_Equality {

	public static void main(String[] args) {
		int a[]=new int[5];
		int b[]=new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter the number for array1");
			a[i]=sc.nextInt();

	    }
		for(int i=0;i<b.length;i++)
		{
			System.out.println("Enter the number for array2");
			b[i]=sc.nextInt();
	    }
		boolean eq = Arrays.equals(a, b);
		if(eq==true)
		{
			System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("Arrays are not equal");
		}
		sc.close();
	}
}
