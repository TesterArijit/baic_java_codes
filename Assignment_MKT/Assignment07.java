package Asignment_java;
//Method Overloading static +non-static
public class Assignment07 {
	public static void Display()
	{
		int x=50,y=2;
		System.out.println("The sum is: "+(x+y));
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
	public void Display(double a,String b)
	{
		int x=10,y=6;
		int area=x*y;
		int peremeter=2*(x+y);
		System.out.println("The area of rectangle is: "+area);
		System.out.println("The peremeter of rectangle is: "+peremeter);
	}
	public void Display(boolean a,char b)
	{
		int h=30,c=6;
		double area=0.5*c*h;
		System.out.println("The area of Triangle is :"+area);
				
	}

	public static void main(String[] args) {
		Display();
		Display(5);
		Assignment07 d=new Assignment07();
		d.Display(false,'a');
		d.Display(0, null);
		}

}
