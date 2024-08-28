package basic01;
import java.util.*;
public class Generation01 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 1 for male & Enter 2 for female");
	int a=sc.nextInt();
	
	
	if(a==1)
	{
		System.out.println("Enter age");
		int b=sc.nextInt();
		sc.close();
		if(b<=5)
		{
			System.out.println("Bus ticke is free");
		}
		else if(b>=6 && b<=15)
		{
			System.out.println("Bus ticke is half");
		}
		else if(b>=16 && b<=59)
		{
			System.out.println("Full fare required");
		}
		else
		{
			System.out.println("Senior fare required");
		}
		
	}
	else
	{
		System.out.println("For female travelling is free");
	}
	
	
	}
}
