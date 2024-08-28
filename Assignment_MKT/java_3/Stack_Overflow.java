package com.jsp;
class Demo{
	
	public void fun()
	{
		fun(); //at com.jsp.Demo.fun(Stack_Overflow.java:6), this error occurs.
	}
}

public class Stack_Overflow {

	public static void main(String[] args) {
		Demo d=new Demo();
		d.fun();

	}

}
