package com.jsp;
class Test1{
	public static void Smoke()
	{
		System.out.println("Complete Smoke testing");
	}
}
class Test2 extends Test1{
	public static void functional()
	{
		System.out.println("Complete functional testing");
	}
}
class Test3 extends Test2{
	public static void Integration()
	{
		System.out.println("Complete Integration testing");
	}
}

public class Abc_test extends Test1  {
	public static void System()
	{
		System.out.println("Complete System testing");
	}

public static void main(String[] args) {
	Abc_test a=new Abc_test();
	a.Smoke();
	a.System();
	////////////////
	Test3 t=new Test3();
	t.functional();
	t.Smoke();
	t.Integration();
			

}

}
