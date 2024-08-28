package com.jsp;

public class E2 {

	public static void main(String[] args) {
		
		int[]a ={10,20,30};
		System.out.println("Connection estd.");
				try {
			System.out.println(a[4]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Array Exception handled first time.");
			
		}
				catch (Exception e) {
					
					System.out.println("Exception handled second time.");
					
				}
		System.out.println("Connection terminate");
		

	}

}
