package basic01;

import java.util.Arrays;
import java.util.Scanner;

public class Copy_Array_value_from_one_array_to_another {

	public static void main(String[] args) {
	Scanner	sc=new Scanner(System.in);
	int a[]=new int[4];
	int b[]=new int[5];
	System.out.println("Enter the value of Array1");
	
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println(Arrays.toString(a));
	for(int i=0;i<a.length;i++)
	{
		b[i]=a[i];
	}
	System.out.println(Arrays.toString(b));
	
	

	}

}
