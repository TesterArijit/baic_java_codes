package com.jsp;
class Test{
	public void fun() throws Exception // throws the exception object into the method present below the stack
	// main method here located below the fun method, so main method handled the exception.
	{
		int a=10;
		int b=0;
		int c=a/b;
		// not handeling the exception only throwing the exception is called ducking exception.
		System.out.println(c);
	}
	
}

public class Ducking_Exception {

	public static void main(String[] args) {
		System.out.println("Main Start");
		
		Test t =new Test();
//		t.fun();//Unhandled exception type Exception
		try {
			
			t.fun();
		} catch (Exception e) {
			System.out.println("Exception handled inside main()");
		}
		System.out.println("Main end");
		
		
		

	}

}
