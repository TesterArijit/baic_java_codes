package com.jsp;
import java.util.Scanner;
public class Array02 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[][] a=new int[2][5];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println("Enter the class "+i+" studennt age of "+j);
				a[i][j]=scan.nextInt();
			}
		}
		System.out.println("The ages are ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println(a[i][j]);
		
	}

}
	}
}
