package infy_java;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting_Element_Array {

	public static void main(String[] args) {
		int a[]=new int[4];
	
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter the number");
			a[i]=sc.nextInt();
			
		}
		
			System.out.println(Arrays.toString(a));
			Arrays.sort(a);
			System.out.println(Arrays.toString(a));
			sc.close();
	
	}

}
