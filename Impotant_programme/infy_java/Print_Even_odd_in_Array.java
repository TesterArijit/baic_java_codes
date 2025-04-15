package infy_java;

import java.util.Scanner;

public class Print_Even_odd_in_Array {

	public static void main(String[] args) {
		int a[]=new int[6];
		int even_no=0;
		int odd_no=0;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter the number");
			a[i]=sc.nextInt();
			
			if(a[i]%2==0)
			{
				even_no++;
			}
			if(a[i]%2!=0)
			{
				odd_no++;
			}
			
		}
		sc.close();
		System.out.println("Total Even no count: "+even_no);
		System.out.println("Total Odd no count: "+odd_no);

	}

}
