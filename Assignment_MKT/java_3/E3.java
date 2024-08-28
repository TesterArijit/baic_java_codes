package com.jsp;

public class E3 {

	public static void main(String[] args) {
		
		System.out.println("Connection estd.");
		
		try {
			System.out.println(5/0);
			
		}
		catch (Exception e) {
			System.out.println("Exception handled in catch");
			
		}
				
		finally {
			
			System.out.println("Exception handled in finally");
			
		}
		System.out.println("Connection terminated.");

	}

}
