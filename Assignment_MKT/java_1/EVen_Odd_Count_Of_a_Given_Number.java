package basic01;

import java.util.Scanner;

public class EVen_Odd_Count_Of_a_Given_Number {

	public static void main(String[] args) {
		Scanner	s=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=s.nextInt();
		int even_count=0;
		int odd_count=0;
		
		while(a>0)
		{
			int num=a%10;
			if(num%2==0)
			{
				even_count++;
			}
			else
			{
				odd_count++;
			}
			a=a/10;
		}
		System.out.println("The count of even number is > "+even_count);
		System.out.println("The count of odd number is > "+odd_count);
		s.close();
	
	}

}
