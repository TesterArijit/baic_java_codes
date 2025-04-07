package infy_java;

import java.util.Scanner;

public class Given_No_PartOf_Array_Not {

	public static void main(String[] args) {
		int a[]=new int[4];
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number which might be the element of the array");
		int num = sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter the number");
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			if(num==a[i])
			{
				count++;
				System.out.println("Given no is part of array having index of:"+i);
			}
				
		}
		if(count==1)
		{
			System.out.println("Given no is part of array");
		}
		else
		{
			System.out.println("Given no is not a part of array");
		}
		sc.close();
		
		

	}

}
