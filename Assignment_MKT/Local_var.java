package Asignment_java;

public class Local_var {
	public void Test1()
	{
		int var1=15,var2=20;
		var1=5;
		System.out.println((var2/var1));
		System.out.println(var1);
	}
	public void Test2()
	{
		int var1=15,var2=20;
		var1=45;
		System.out.println((var2%var1));
		System.out.println(var1);
	}
	public void Test3()
	{
		int var1=15,var2=20;
		var2=30;
		System.out.println((var2*var1));
		System.out.println(var2);
	}
	public void Test4()
	{
		int var1=15,var2=20;
		var2=45;
		System.out.println((var2+var1));
		System.out.println(var2);
	}
	
	public static void main(String[] args) {
		Local_var L =new Local_var();
		L.Test1();
		L.Test2();
		L.Test3();
		L.Test4();
	}
}
