package javasessions;

public class MathOperators {

	public static void main(String[] args) {
System.out.println(10/2);
		
		System.out.println(9/2);//4
		
		System.out.println(9.0/2);//4.5
		
		System.out.println(9.0/2.0);//4.5
		
		System.out.println(9/2.0);//4.5
		
		//System.out.println(9/0); //ArithmeticException
		//System.out.println(0/0);//AE
		
		System.out.println(0/9); //0
		
		System.out.println(9.0f/2);//4.5
		
		System.out.println(9.1/0);//Infinity
		System.out.println(9.2f/0);//Infinity
		System.out.println(9/0.0);//Infinity
		System.out.println(9.0/0.0);//Infinity
		
		
		System.out.println(0.0/0);//NaN - not a number
		System.out.println(0/0.0);//NaN
		System.out.println(0.0/0.0);//NaN
		System.out.println(0.0f/0.0f);//NaN
		
		
		System.out.println(9*2);
		System.out.println(9-2);
		
		System.out.println(9 % 2);
		System.out.println(8 % 2);
		System.out.println(20 % 7);
		
		//System.out.println((byte)20 / 0);//AE
		//System.out.println(20L/0);//AE

	}

}
