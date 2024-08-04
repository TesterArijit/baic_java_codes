package Assignment_MKT;

import java.util.Arrays;
import java.util.Scanner;

public class DoubleDatatype_Array {

	public static void main(String[] args) {
		Scanner	sc=new Scanner(System.in);
		double [] a=new double[4];

		System.out.println("Enter the array values");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextDouble();
		}
		System.out.println("The values of array are :> "+Arrays.toString(a));
		sc.close();

	}

}
