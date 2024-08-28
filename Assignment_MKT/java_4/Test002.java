package Demo;
class A{
	public static final void m1()
	{
		System.out.println("Hi");
	}
	public static final void m1(int a)
	{
		System.out.println("Hi bye");
	}
	public static final void m1(int b,int c)
	{
		System.out.println("Hi tata");
	}
	
}
public class Test002 extends A {
	
		
	public static void main(String[] args) {
		m1(7);	
}
}
