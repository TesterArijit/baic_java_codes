package Test_java;

public class just {
	public static void main()
	{
		System.out.println("Hi");
	}
	public static void main(int a)
	{
		System.out.println("value of a is:-"+a);
	}
	public static void main(int a,float b)
	{
		System.out.println("value of a & b is:-"+a+" "+b);
	}

	public static void main(String[] args) {
		main();
		main(10);
		main(20,20.5f);
		
	}

}
