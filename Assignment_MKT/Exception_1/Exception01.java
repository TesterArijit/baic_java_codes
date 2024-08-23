package Exception_1;

import java.util.Scanner;

public class Exception01 {

	public static void main(String[] args) {
		Scanner	s=new Scanner(System.in);
		System.out.println("Enter the age");
		
		try {
			int a=s.nextInt();
			try {
				
			} catch (Exception e) {
				System.out.println("Sorry! enter age");
				System.out.println("Enter the age");
			}
		} catch (Exception e1) {
			int a=s.nextInt();
		}
		System.out.println("Enter the name");
		String b=s.next();

		

	}

}
