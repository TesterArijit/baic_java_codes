package infy_java;

import java.util.Arrays;

public class InsetElement_InArray {
	
	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		int pos=3;
		int element=100;
		
		for(int i=a.length-1;i>pos-1;i--)
		{
			a[i]=a[i-1];
		}
		
		a[pos-1]=element;
		
		for(int i=0;i<a.length;i++)
		{
				System.out.println(a[i]);
		}
		System.out.print(Arrays.toString(a));
		
		
	}

}
