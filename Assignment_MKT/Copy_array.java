package Assignment_MKT;

import java.util.Arrays;
import java.util.Scanner;

public class Copy_array {

	public static void main(String[] args) {
		Scanner	sc=new Scanner(System.in);
		int [] Array1=new int[4];
		int [] Array2=new int[6];
		System.out.println("Enter the values of Array1");
		
		for(int i=0;i<Array1.length;i++)
		{
			Array1[i]=sc.nextInt();
		}
		System.out.println("The values of Array1 is :> "+Arrays.toString(Array1));
		System.out.println("The values of Array2 before copy :> "+Arrays.toString(Array2));
		
		for(int i=0;i<Array1.length;i++)
		{
			Array2[i]= Array1[i];
		}
		System.out.println("The values of Array2 after copy :> "+Arrays.toString(Array2));
			

	}

}
