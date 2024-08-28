package Test_java;

import java.util.Scanner;

public class Ts_2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int p=scan.nextInt();
		if(p%2==0)
		{
			System.out.println(p+" is even number");
		}
		else
		{
			System.out.println(p+" is odd number");
		}

	}

}
