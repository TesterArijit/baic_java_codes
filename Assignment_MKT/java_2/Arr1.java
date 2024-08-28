package test.one;

import java.util.Iterator;

public class Arr1 {
	public static void main(String[] args) {
		
		int[] a=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		a[1]=100;
		System.out.println(a[1]);
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//		}
		int b[]=a;
		System.out.println(b[3]);
		
		int c[]= {5,15,25,35};
		System.out.println(c[2]);
				
	}

}
