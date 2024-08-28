package basic01;

import java.util.Scanner;

public class ASS_49a_mkt {

	public static void main(String[] args) {
		Scanner	sc=new Scanner(System.in);
		System.out.println("enter the string having length=5");
		String b="Hello";
		String a=sc.next();
		if(a.length()==b.length())
		{
			System.out.println("Thank you!");
		}
		else
		{
			try {
				
				System.out.println(a.charAt(10));
				System.out.println("Hi");
				
			} catch (StringIndexOutOfBoundsException e) {
				System.out.println("Sorry! enter correct string,try again!");
				
			}
		}
		
	}

}
