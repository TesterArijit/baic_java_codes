package com.basic.Impotant_programme;

public class Min_Max_finding_In_a_GivenArray {

	public static void main(String[] args) {
		
		int [] a= {10,2,52,40};
		
		int max=a[0];
		int min=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("The maximum value in the array is :>> "+max);
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min) 
			{
				min=a[i];
			}
		}
		System.out.println("The minimum value in the array is :>> "+min);
	
	}

}
