package selinium.TestNG;

import org.testng.annotations.Test;

public class Fifth_TestNG {
	@Test
	public void launch()
	{
		System.out.println("Browser launch");
	}
	@Test(priority=1,enabled=true)
	public void url_search()
	{
		System.out.println("Search the URL");
	}
	@Test(priority=2)
	public void register()
	{
		System.out.println("Register first");
	}
	@Test(priority=3)
	public void login()
	{
		System.out.println("Login with credential");
	}


}
