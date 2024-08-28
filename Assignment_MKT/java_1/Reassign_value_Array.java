package basic01;

import java.util.Arrays;
import java.util.Scanner;

public class Reassign_value_Array {
	

	public static void main(String[] args) {
		int [] a=new int[4];
		int [] b=new int[4];
				
	Scanner	sc=new Scanner(System.in);
	System.out.println("Enter the value of array 1");
		
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("The digits of array1 is : > "+Arrays.toString(a));
	System.out.println("Enter the value of array 2");
	
	for(int i=0;i<b.length;i++)
	{
		b[i]=sc.nextInt();
	
	}
	System.out.println("The digits of array2 is : > "+Arrays.toString(b));
	
	for(int i=0;i<b.length;i++)
	{
		b[i]=a[i];
	
	}
	System.out.println("The reassign arr : > "+Arrays.toString(b));
		
	}
	

}
