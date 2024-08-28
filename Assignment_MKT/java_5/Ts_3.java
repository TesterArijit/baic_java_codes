package Test_java;

import java.util.Scanner;

public class Ts_3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number 1");
		int p=scan.nextInt();
		System.out.println("Enter the number 2");
		int v=scan.nextInt();
		System.out.println("Enter the value");
		int r=scan.nextInt();
		
		switch(r)
		{
		case 1:{
			System.out.println("The sum is :"+(p+v));
			break;
		}
		case 2:{
			System.out.println("The sub is :"+(p-v));
			break;
		}
		case 3:{
			System.out.println("The mult is :"+(p*v));
			break;
		}
		case 4:{
			System.out.println("The div is :"+(p/v));
			break;
		}
		case 5:{
			System.out.println("The mod is :"+(p%v));
			break;
		}
		default:{
			System.out.println("Invalid entry!");
		}
	
		}

	}

}
