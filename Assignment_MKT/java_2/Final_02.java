package test.one;
//final method cannot override but overloaded & inherited.
class A{
	public final void Hi()
	{
		System.out.println("Hi");
	}
	
	public final void Hi(int a)
	{
		System.out.println("Hutr!");
		
	}
}
class B extends A{
	
	public final void Hi(float b)
	{
		System.out.println("Hi float!");
	}
	
}

public class Final_02 {

	public static void main(String[] args) {
		B p=new B();
		p.Hi();
		p.Hi(10);
		p.Hi(3.5f);
		
		

	}

}
