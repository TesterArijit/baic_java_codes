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

public class All_TestAnotation_with_TwoTest {
@BeforeSuite
public void Before_Suite()
{
	System.out.println("Before-Suite");
}
@BeforeTest
public void Before_Test()
{
	System.out.println("Before-Test");
}
@BeforeClass
public void Before_Class()
{
	System.out.println("Before-Class");
}
@BeforeMethod
public void Before_Method()
{
	System.out.println("Before-Method");
}
@Test
public void Test1()
{
	System.out.println("Test case-1");
}
@AfterMethod
public void After_Method()
{
	System.out.println("After-Method");
}
@BeforeMethod
public void Before_Method1()
{
	System.out.println("Before-Method1");
}
@Test
public void Test2()
{
	System.out.println("Test case-2");
}
@AfterMethod
public void After_Method1()
{
	System.out.println("After-Method1");
}
@AfterClass
public void After_Class()
{
	System.out.println("After-Class");
}
@AfterTest
public void After_Test()
{
	System.out.println("After-Test");
}
@AfterSuite
public void After_Suite()
{
	System.out.println("After-Suite");
}
//Execution Result---->>
//Before-Suite
//Before-Test
//Before-Class
//Before-Method
//Before-Method1
//Test case-1
//After-Method
//After-Method1
//Before-Method
//Before-Method1
//Test case-2
//After-Method
//After-Method1
//After-Class
//After-Test

}
