package com.jsp;
//----printStaclTrace && propagration of exception Object.
import java.util.Scanner;

class A{
	public void fun1()
	{ 
		 Scanner scan =new Scanner(System.in);
		System.out.println("Connection 4 established");
		System.out.println("Enter numerator");
		int a=scan.nextInt();
		System.out.println("Enter denominator");
		int b=scan.nextInt();
		int c=a/b;
		System.out.println(c);
		System.out.println("Connection 4 terminated");
		
		
	}
	
}
class B{
	public void fun2()
	{
		System.out.println("Connection 3 established");
		A s1=new A();
		s1.fun1();
		System.out.println("Connection 3 terminated");
		
	}
	
}
class C{
	public void fun3()
	{
		System.out.println("Connection 2 established");
		B s2=new B();
		s2.fun2();
		System.out.println("Connection 2 terminated");
		
	}
	
}

public class E7 {

	public static void main(String[] args) {
		System.out.println("Connection 1 established");
		
		C s3=new C();
		try {
			
			s3.fun3();
		}
		catch (Exception e) {
			//e.printStackTrace();
			System.out.println("Exception handled inside main()");
			
		}
		
		System.out.println("Connection 1 terminated");
	
	}

}
