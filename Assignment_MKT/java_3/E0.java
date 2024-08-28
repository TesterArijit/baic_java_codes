package com.jsp;

public class E0 {

	public static void main(String[] args) {
		System.out.println("Main method Starts!");
		//System.out.println(5/0);
    	
		try {
		System.out.println(5/0);
			
		}
		catch(ArithmeticException e){
			System.out.println("Infinite");
			
		}
		
		System.out.println("Main method ends!");

	}

}
