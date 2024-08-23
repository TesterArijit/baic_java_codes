package com.basic.Impotant_programme;

import java.util.Arrays;

public class Reverse_Array {

	public static void main(String[] args) {
		int Old_Array []=new int[3];
		int Reverse_Array []=new int[3];
		
		Old_Array[0]=10;
		Old_Array[1]=20;
		Old_Array[2]=30;
		
		for(int i=0,k=Reverse_Array.length-1;i<Old_Array.length;i++)
		{
			Reverse_Array [k]=Old_Array [i];
			k--;
		}
		System.out.println(Arrays.toString(Old_Array));
		System.out.println(Arrays.toString(Reverse_Array));
		

	}

}
