package selinium.TestNG;

import org.testng.annotations.Test;

public class Grouping1 {
	@Test(groups={"smoke","system"})
	public void Test1()
	{
		System.out.println("One");
	}
	@Test(groups={"smoke"})
	public void Test2()
	{
		System.out.println("Two");
	}
	@Test(groups={"smoke"})
	public void Test3()
	{
		System.out.println("Three");
	}
	@Test(groups={"system"})
	public void Test4()
	{
		System.out.println("Four");
	}
	@Test(groups={"smoke"})
	public void Test5()
	{
		System.out.println("Fifth");
	}

}
