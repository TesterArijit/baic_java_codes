package Asignment_java;
class AT{
	public AT(boolean a)
	{
		System.out.println("Hello");
	}
	
	}
class AT1 extends AT{
	public AT1()
	{
		super(true);
		System.out.println("Hi");
	}
	
}
class AT2 extends AT1{
	public AT2()
	{
		System.out.println("Java");
	}
	
}
class AT3 extends AT2{
	public AT3()
	{
		System.out.println("Python");
	}
	
}
class AT4 extends AT3{
	public AT4(int a)
	{
		System.out.println("Power BI");
	}
	
}

public class Super_Calling_a extends AT4 {
	public Super_Calling_a()
	{super(5);
		System.out.println("Learning");
	}

 public static void main(String[] args) {
	 new Super_Calling_a();
	 
	 
		

	}

}
