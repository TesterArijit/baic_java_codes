package basic01;

import java.util.Scanner;

public class Ab1 {

	public static void main(String[] args) {
		int a[]=new int[4];
		try {
			System.out.println(a[8]);
			
		} catch (Exception e) {
			System.out.println("Exception handled");
		}
	}

}
