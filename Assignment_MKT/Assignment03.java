package Asignment_java;
//WAP to call multiple static menthod inside main method.
public class Assignment03 {
	public static void Method1()
	{
		System.out.println("Hi");
	}
	public static void Method2()
	{
		int a=5,b=10;
		System.out.println((a+b));
	}
	public static void Method3()
	{
		int a=5,b=10,c=8;
		System.out.println((a*b*c));
	}
	public static void Method4()
	{
		int r=5;
		double pi=3.14;
		double area=pi*r*r;
		System.out.println("The area of circle is: "+area);
	}

	public static void main(String[] args) {
		Method1();
		Method2();
		Method3();
		Method4();

	}

}
