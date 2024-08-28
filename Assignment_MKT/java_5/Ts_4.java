package Test_java;

public class Ts_4 {
	Ts_4()
	{
		System.out.println("Hi");
	}
	Ts_4(int a)
	{
		this();
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		
		new Ts_4(10);
		
		System.out.println("Welcome");
		
	}

}
