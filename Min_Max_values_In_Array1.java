package infy_java;

import java.util.Scanner;

public class Min_Max_values_In_Array1 {

	public static void main(String[] args) {
		int a[]=new int[4];
		int max=a[0];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter the number");
			a[i]=sc.nextInt();
		}
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Max no is : "+max);
		sc.close();

	}

}
