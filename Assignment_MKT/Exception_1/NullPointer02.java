package Exception_1;

import java.util.Scanner;

public class NullPointer02 {

	public static void main(String[] args) throws NullPointerException {
	Scanner	sc=new Scanner(System.in);
	System.out.println("Enter the String");
	
	try {
		String s=sc.next();
		System.out.println(s.length());
		
	} catch (NullPointerException e) {
		System.out.println("You entered null");
		
	}
	}

}
