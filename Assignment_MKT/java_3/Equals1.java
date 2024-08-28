package com.jsp;

public class Equals1 {
	
	public boolean equals(Object obj)
	{
		return true;
		
	}
	
	public static void main(String[] args) {
		
		Equals1 e=new Equals1();
		System.out.println(e.equals(e));
		
		Equals1 e1=new Equals1();
		System.out.println(e1.equals(e));
		
		
		
	}

}
