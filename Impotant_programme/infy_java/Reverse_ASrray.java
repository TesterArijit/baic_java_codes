package infy_java;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse_ASrray {

	public static void main(String[] args) {
		Scanner	sc=new Scanner(System.in);
		int a[]= new int [4];
		int b[]= new int [4];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter the number");
			a[i]=sc.nextInt();
		}
		for(int i=0,k=b.length-1;i<a.length;i++)
		{
			b[k]=a[i];
			k--;
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	

	}

}
