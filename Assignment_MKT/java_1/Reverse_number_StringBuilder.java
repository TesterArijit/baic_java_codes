package basic01;

import java.util.Scanner;

public class Reverse_number_StringBuilder {

	public static void main(String[] args) {
		Scanner	s=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=s.nextInt();
		StringBuilder rev;
		StringBuilder sb=new StringBuilder();
		sb.append(a);
		rev=sb.reverse();
		System.out.println("The reverse number is  >> "+rev);
		
		

	}

}
