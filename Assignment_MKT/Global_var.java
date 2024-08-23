package Asignment_java;
//Final Variable
public class Global_var {
	static double pi=3.14;
	static float radius=5.87f;
	public static void Area()
	{
		double area=pi*radius*radius;
		System.out.println("Circle area is: "+area);
	}
	public static void Circumference()
	{ 
		final double radius=8.458f;
		double circumference = 2*pi*radius;
		System.out.println("Circle circumference is: "+circumference);
	}
	public static void main(String[] args) {
		Area();
		Circumference();
	}

}
