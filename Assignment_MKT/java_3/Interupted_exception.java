package com.jsp;

public class Interupted_exception {

	public static void main(String[] args) {
		
		System.out.println("Main Starts");
		try {
			Thread.sleep(2000);
			
		} catch (InterruptedException e) {
			
		 System.out.println("Exception handled.");// not executed.


		}
		System.out.println("Main ends");
		

	}

}
