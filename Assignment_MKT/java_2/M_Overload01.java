package test.one;
//Static Overloading
public class M_Overload01 {
	public static void Display1()
	{
		System.out.println("O parameter");
	}
	public static void Display1(int a)
	{
		System.out.println("One parameter");
	}
	public static void Display1(int b, int c)
	{
		System.out.println("Two parameter");
	}
	public static void Display1(float f)
	{
		System.out.println("Float parameter");
	}


	public static void main(String[] args) {
		Display1();
		Display1(10);
		Display1(20,30);
		Display1(5.4f);
		
		//System.out.println(Math.sqrt(10));
	}

}
