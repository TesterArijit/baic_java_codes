package Asignment_java;
//Constructor overloading
public class Assignment08 {
	public Assignment08()
	{
		System.out.println("zero parameter Constructor!");
	}
	public Assignment08(int a, int b)
	{
		System.out.println("parameterized Constructor int and int");
	}

	public Assignment08(float a, float b)
	{
		System.out.println("parameterized Constructor float and float");
	}

	public Assignment08(double a, double b)
	{
		System.out.println("parameterized Constructor double and double");
	}
	public static void main(String[] args) {
		new Assignment08();
		new Assignment08(0, 0);
		new Assignment08(7.0f,8.5f);
		new Assignment08(7.7, 7.8);
	}
}
