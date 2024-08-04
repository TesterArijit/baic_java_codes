package Assignment_MKT;

import java.util.Arrays;

// In an Array of int data type of size four the values are 100,200, 300 
//and 400.Check if the given number is a part of Array or not?


public class GivenNumber_PartofArray_OrNot1 {

	public static void main(String[] args) {
		int [] a =new int[4];
		a[0] =100;
		a[1] =200;
		a[2] =300;
		a[3] =400;
		int Given_number=100;
		int count=0;
		//System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++)
		{
			if( Given_number==a[i])
			{
				count++;
			}
		}
		if(count==1)
		{
			System.out.println("Given number is a part of array");
		}
		else
		{
			System.out.println("Given number is not a part of array");
		}
	
	}

}
