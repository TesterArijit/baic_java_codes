package Asignment_java;

public class Local_Global_var {
	static int x=50; //Global var
	static int Q=80;
	public static void sum(int a)
	{
		a=20;
		System.out.println(x+a);
	}
	public static void sub()
	{
		int y=20;
		System.out.println((x-y));
	}
	public static void mult()
	{
		int y=25;
		System.out.println((x*y));
	}
	public static void div()
	{
		int y=8;
		System.out.println((x/y));
		System.out.println("The value of Q is :"+Q);
	}

	public static void main(String[] args) {
		sum(5);
		sub();
		mult(); 
		div();
		
	}

}
