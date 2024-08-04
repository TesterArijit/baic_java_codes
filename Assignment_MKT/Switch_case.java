package Assignment_MKT;

import java.util.Scanner;

public class Switch_case {

	public static void main(String[] args) {
	Scanner	sc=new Scanner(System.in);
	System.out.println("Enter the value");
	int a=sc.nextInt();
	switch (a) {
	case 1:{
		System.out.println("Switch on the Fan");
		break;
		}
	case 2:{
		System.out.println("Switch on the TV");
		break;
		}
	case 3:{
		System.out.println("Switch on the Light");
		break;
		}
	case 4:{
		System.out.println("Switch on the AC");
		break;
		}
		default:{
			System.out.println("Invalid input!");
		}
		sc.close();
		
	}

	}
}
