package basic01;

import java.util.InputMismatchException;
import java.util.Scanner;

// Take size from scanner class n get two exception one for nextInt 
//other for ArrayOutOfBoundException Handled it using try catch
public class ASS_48_mkt {

	public static void main(String[] args) {
		Scanner	sc=new Scanner(System.in);
		
		
		try {
			System.out.println("Enter any number");
			int num= sc.nextInt();
			
		} catch (InputMismatchException e) {
			System.out.println("Sorry!Please enter only number");
			
			System.out.println("Enter the values in array !");
		}
		int [] b = new int [4];
		Scanner	sc1=new Scanner(System.in);
		
		try {
			for(int i=0;i<=b.length;i++)
			{
				b[i]=sc1.nextInt();
			}
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException handled successfully!");
			
		}
		
		}
}
