package infy_java;

import java.util.Random;

public class Random_No {

	public static void main(String[] args) {
		int a=10;
		double d = a*Math.random();
		System.out.println(d);
		
		//2nd approch
		
		Random r=new Random();
		int p = r.nextInt(15);
		System.out.println(p);

	}

}
