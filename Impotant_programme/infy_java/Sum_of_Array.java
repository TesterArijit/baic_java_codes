package infy_java;

import java.util.Scanner;

public class Sum_of_Array {

	public static void main(String[] args) {
		int a[]=new int[4];
		int sum=0;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter the number");
			a[i]=sc.nextInt();
		}
		for(int num:a)
		{
			sum=sum+num;
		}
		System.out.println(sum);
		sc.close();
		

	}

}
