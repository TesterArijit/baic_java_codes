package basic01;

import java.util.Arrays;
import java.util.Scanner;

public class Check_arrays_equal_or_not {

	public static void main(String[] args) {
		int [] a = new int[4];
		int [] b = new int[4];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of array1");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter the value of array1");
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		boolean ans=Arrays.equals(a, b);
		System.out.println(ans);
		sc.close();

	}

}
