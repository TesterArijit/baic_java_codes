package Assignment_MKT;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_EqualToEachOther_OrNot {

	public static void main(String[] args) {
		Scanner	sc=new Scanner(System.in);
		int [] a=new int [4];
		int [] b=new int [4];
		System.out.println("Enter the values of Array1");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the values of Array2");
		for(int i=0;i<a.length;i++)
		{
			b[i]=sc.nextInt();
		}
		
		if(Arrays.equals(a, b))
		{
			System.out.println("Arrays are equal in size");
		}
		else
		{
			System.out.println("Arrays are not equal in size");
		}
		sc.close();

	}

}
