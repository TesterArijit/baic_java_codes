package com.jsp;
 class Hello{
	 
	 public final void m1() {
		 System.out.println("Value -1");
	 }
	 public final void m1(int a) {
		 System.out.println("Value -2");
	 }
	
}
public class Final_1 extends Hello {
	public final void m1(float b) {
		 System.out.println("Value -3");
	}

	public static void main(String[] args) {
		
		Final_1 f=new Final_1();
		f.m1(10.5f);
		
		
		
			
		}

	}


