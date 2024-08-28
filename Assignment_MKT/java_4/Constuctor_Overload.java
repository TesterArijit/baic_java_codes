package Demo;

public class Constuctor_Overload {
	int x=15;
	public Constuctor_Overload()
	{
		//int x=25;
		int y=10;
		System.out.println((x+y));
		
	}
	public Constuctor_Overload(int a)
	{
		System.out.println(a);
	}
	public Constuctor_Overload(String a)
	{
		System.out.println(x);
		int y=5;
		System.out.println(x-y);
	}
	public Constuctor_Overload(double a)
	{
		int y=5;
		System.out.println(x/y);
	}
	public Constuctor_Overload(boolean a)
	{
		int y=5;
		System.out.println(x%y);
	}
		public static void main(String[] args) {
		new Constuctor_Overload();
		new Constuctor_Overload(5);
		new Constuctor_Overload("Hi");
		new Constuctor_Overload(5.55);
		new Constuctor_Overload(true);
	}

}
