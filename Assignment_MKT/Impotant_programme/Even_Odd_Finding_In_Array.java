package com.basic.Impotant_programme;

public class Even_Odd_Finding_In_Array {

	public static void main(String[] args) throws InterruptedException {
		int [] a= {11,12,88,95,33,55,56,24};
		
		System.out.println("Odd Number");
		
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2!=0) 
			{ 
				System.out.println(a[i]);
				Thread.sleep(2000);
			}
		}
		
		System.out.println("Even Number");
		
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2==0) 
			{ 
				System.out.println(a[i]);
				Thread.sleep(2000);
			}
		}
		
	}

}
