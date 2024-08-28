package com.jsp;
import java.util.Scanner;
class E01{
	public void fun1()
	{
		System.out.println("Connection 2 established.");//----->2
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the numeretor");//----->3
		int a =scan.nextInt();
		System.out.println("Enter the denominator");//----->4
		int b =scan.nextInt();
		int c=a/b;//----->5
		System.out.println(c);
		System.out.println("Connection 2 terminated.");
		
	}

	
}

public class E4 {

	public static void main(String[] args) {
		
		System.out.println("Connection 1 established");//----->1
		E01 s=new E01();
		try {
			s.fun1();
		} catch (Exception e) {
			System.out.println("Exception handled inside main()");//----->6
		}
		System.out.println("Connection 1 terminated");//----->7
		
		

	}

}
