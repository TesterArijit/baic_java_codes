package Asignment_java;
//Super calling statement
class Mestho{
	public Mestho(boolean a)
	{
		System.out.println("1");
	}
}
class Tulso extends Mestho{
	public Tulso(String p)
	{super(true);
		System.out.println("2");
	}
}
class Miaski extends Tulso{
	public Miaski(int a, float b)
	{
		super("Hi");
		System.out.println("3");
	}
}
class Europa extends Miaski{
	public Europa(int a)
	{
		super(20,45.87f);
		System.out.println("4");
	}
}
public class Super_Calling extends Europa{
	
	public Super_Calling() {
		super(15);
		System.out.println("5");
		
	}

	public static void main(String[] args) {
		
	  new Super_Calling();

	}

}
