package Exception_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		try {
			int a=sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Sorry! Invalid input, try again!");
			System.out.println("Enter any number");
			Scanner sc1=new Scanner(System.in);
			
			try {
				int a1=sc1.nextInt();
				
			} catch (InputMismatchException e2) {
				System.out.println("Sorry! Invalid input, this is last chance!");
				System.out.println("Enter any number");
				Scanner sc2=new Scanner(System.in);
				try {
					int a2=sc2.nextInt();
					
					System.out.println("Thank yoy for entering number");
					
				} catch (InputMismatchException e3) {
					
					System.out.println("Sorry! you are terminated!");
				}
				
			}
			
		}
	

	}
	

}
