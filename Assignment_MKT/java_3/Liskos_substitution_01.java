package com.jsp;
class AR{
	public void fun() throws Exception
	{
		int a=10;
		int b=0;
		int c=a/b;
		System.out.println(c);
	}
	
}
class Demo1 extends AR{
	
	public void fun()
	{
		System.out.println("Inside child class fun()");
	}
	
}


public class Liskos_substitution_01  {

	public static void main(String[] args) {
		Demo1 d1=new Demo1();
		d1.fun(); // not showing any exception error
		
		

	}

}
