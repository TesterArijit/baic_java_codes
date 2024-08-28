package com.jsp;
import java.util.Scanner;
public class Array03 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int[][][] a=new int[2][3][5];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				for(int k=0;k<a[i][j].length;k++)
				{
					System.out.println("School of "+i+"Class of "+j+"Student age of "+k);
					a[i][j][k] =scan.nextInt();
				}
			}
		}
		System.out.println("The agees of students are :-");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				for(int k=0;k<a[i][j].length;k++)
				{
					System.out.println(a[i][j][k]);
					
				}
			}
		}
		
		
		
		

	}
}


