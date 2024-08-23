package Exception_1;

import java.util.Scanner;

public class Exceptio02 {

	public static void main(String[] args) {
		Scanner	sc=new Scanner(System.in);
		int [] a=new int [4];
		
		System.out.println("Enter the values in array!");
		try {
			for(int i=0;i<a.length;i++)
			{
				a[i]=sc.nextInt();
			}
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception handled");
			
		}

	}

}
