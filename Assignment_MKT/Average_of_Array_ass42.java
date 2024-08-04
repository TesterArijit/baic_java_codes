package Assignment_MKT;

import java.util.Arrays;
import java.util.Scanner;

// WAP to find out average of an array of int data type whose size is 4?
public class Average_of_Array_ass42 {

	public static void main(String[] args) {
	Scanner	sc=new Scanner(System.in);
	int [] a=new int [4];
	int sum=0;
	System.out.println("Enter the vaulues of array!");
	
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	for(int i=0;i<a.length;i++)
	{
		sum=sum+a[i];
	}
	int Average=sum/4;
	System.out.println("The values of the array are : >> "+Arrays.toString(a));
	System.out.println("The average of the array is :>> "+Average);

	}

}
