package Assignment_MKT;

import java.util.Scanner;

public class GivenNumber_PartofArray_OrNot {
	static int Given_Number;
	
	
	public static void main(String[] args) {
		int count=0;
		int [] a=new int[4];
		Scanner	sc=new Scanner(System.in);
		
		System.out.println("Enter the values in array");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
		System.out.println("Enter any number");
		Given_Number=sc.nextInt();
		
		for(int i=0;i<a.length;i++)
		{
		
			if(Given_Number==a[i])
			{
				count++;
				System.out.println("Given number "+Given_Number+" is part of array having of index "+i);
								
			}
			else {
				System.out.println("given number is not a art of array");
				
			}
		}
		
	
	}

}
