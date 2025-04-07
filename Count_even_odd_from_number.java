package infy_java;

import java.util.Scanner;

public class Count_even_odd_from_number {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		int even_count=0;
		int odd_count=0;
		while(a>0)
		{
			int c=a%10;
			a=a/10;
			if(c%2==0)
			{
				even_count++;
			}
			if(c%2!=0)
			{
				odd_count++;
			}
			
		}
		System.out.println("No of even : "+even_count);
		System.out.println("No of odd : "+odd_count);
		
		
	}

}
