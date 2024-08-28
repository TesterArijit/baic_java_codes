package com.jsp;
import java.util.Scanner;
class E02{
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
		// to execute next line we have to use finally block >>
		
		finally {
			System.out.println("Connection 2 terminated");//----->6
			
		}
		
	}

	
}

public class E5 {

	public static void main(String[] args) {
		
		System.out.println("Connection 1 established");//----->1
		E02 s=new E02();
		try {
			s.fun1();
		} catch (Exception e) {
			System.out.println("Exception handled inside main()");//----->7
		}
		System.out.println("Connection 1 terminated");//----->8
		
		

	}

}
