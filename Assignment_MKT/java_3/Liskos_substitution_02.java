package com.jsp;
class BR{
	public void fun() throws ArithmeticException
	{
		int a=10;
		int b=0;
		int c=a/b;
		System.out.println(c);
	}
	
}
class Demo2 extends BR  {
	
	public void fun() throws NullPointerException
	{
		System.out.println("Inside child class fun()");
	}
	
}


public class Liskos_substitution_02  {

	public static void main(String[] args) {
		Demo2 d2=new Demo2();
		d2.fun(); // not showing any exception error
		
		

	}

}
