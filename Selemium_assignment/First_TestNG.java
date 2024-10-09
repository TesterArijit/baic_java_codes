package selinium.TestNG;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class First_TestNG {
	@BeforeSuite
	public void tc1()
	{
		System.out.println("Hi"); //---1
	}
	@BeforeTest
	public void tc2()
	{
		System.out.println("Hii");//---2
	}
	@BeforeClass
	public void tc3()
	{
		System.out.println("Hii");//---3
	}
	@BeforeMethod
	public void tc4()
	{
		System.out.println("Hihihi");//---3
	}
	@Test 
	// This is the main one.
	public void testcase()
	{
		System.out.println("TestNG testcase");//---3
	}
	@AfterMethod
	public void tc6()
	{
		System.out.println("Ti");//---3
	}
	@AfterClass
	public void tc7()
	{
		System.out.println("To");//---4
	}
	@AfterTest
	public void tc8()
	{
		System.out.println("Toi");//---5
	}
	@AfterSuite
	public void tc9()
	{
		System.out.println("Toip");//---5
	}
			
	}
//Only one TC will execute , because there is only one @Test
//	Every @Test we have its own aftermethod and before method.
	
	


	


