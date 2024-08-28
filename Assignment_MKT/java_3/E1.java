package com.jsp;

public class E1 {

	public static void main(String[] args) {
		
		System.out.println("Mains starts!");
		String a="Arijit";
	  
		try {
			System.out.println(a.charAt(9));
		
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("String Out of limit index!");
			
		}
		System.out.println("Mains ends!");
		
		
		

			
		}
	   
	
	
	
		
	}


