package com.jsp;
import java.util.Scanner;
class E03{
	public void fun1()
	{
		try {
			System.out.println("Connection 2 established.");//----->2
			Scanner scan =new Scanner(System.in);
			System.out.println("Enter the numeretor");//----->3
			int a =scan.nextInt();
			System.out.println("Enter the denominator");//----->4
			int b =scan.nextInt();
			int c=a/b;//----->5
			System.out.println(c);
			
		} 
		catch (Exception e) {
			System.out.println("Exception handled inside fun1()");//----->6
			throw e;
		}
		// to execute next line we have to use finally block >>
		
		finally {
			System.out.println("Connection 2 terminated");//----->7
			
		}
		
	}

	
}

public class E6 {

	public static void main(String[] args) {
		
		System.out.println("Connection 1 established");//----->1
		E03 s=new E03();
		try {
			s.fun1();
		} catch (Exception e) {
			System.out.println("Exception handled inside main()");//----->8
		}
		System.out.println("Connection 1 terminated");//----->9
		
		

	}

}
