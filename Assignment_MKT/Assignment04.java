package Asignment_java;
//WAP to demonstrate Constructor with parameter
public class Assignment04 {
	public Assignment04(int d)
	{
		int a=10;
		int b=6;
		int area = a*b;
		int peremeter=2*(a+b);
		System.out.println("The area of rectangle is :"+area);
		System.out.println("The peremeter of rectangle is :"+peremeter);
	}

  public static void main(String[] args) {
		new Assignment04(10);
	}
}
