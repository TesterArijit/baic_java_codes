package Asignment_java;
// Static Method Overloading
public class Assignment06 {
	public static void Display()
	{
		int x=50;
		System.out.println(x);
	}
	public static void Display(int a)
	{
		int x=5;
		double pi=3.14;
		double area=pi*x*x;
		double peremeter=2*pi*x;
		System.out.println("The area of circle is: "+area);
		System.out.println("The peremeter of circle is: "+peremeter);
	}
	public static void Display(double a,String b)
	{
		int x=10,y=6;
		int area=x*y;
		int peremeter=2*(x+y);
		System.out.println("The area of rectangle is: "+area);
		System.out.println("The peremeter of rectangle is: "+peremeter);
	}
	public static void Display(boolean a,char b)
	{
		int h=30,c=6;
		double area=0.5*c*h;
		System.out.println("The area of Triangle is :"+area);
				
	}

	public static void main(String[] args) {
		Display();
		Display(5);
		
	}

}
