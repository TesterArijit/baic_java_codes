package ab45_TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A44_All_9_Anotations {
	@Test
	public void Test()
	{
		System.out.println("Test");
	}
	@BeforeMethod
	public void Bm()
	{
		System.out.println("BeforeMethod");
	}
	@AfterMethod
	public void Am()
	{
		System.out.println("AfterMethod");
	}
	@BeforeClass
	public void Bc()
	{
		System.out.println("BeforeClass");
	}
	@AfterClass
	public void Ac()
	{
		System.out.println("AfterClass");
	}
	@BeforeTest
	public void Bt()
	{
		System.out.println("BeforeTest");
	}
	@AfterTest
	public void At()
	{
		System.out.println("AfterTest");
	}
	@BeforeSuite
	public void Bs()
	{
		System.out.println("BeforeSuite");
	}
	@AfterSuite
	public void As()
	{
		System.out.println("AfterSuite");
	}

}
