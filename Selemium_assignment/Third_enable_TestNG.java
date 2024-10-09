package selinium.TestNG;

import org.testng.annotations.Test;

public class Third_enable_TestNG {
	@Test
	public void launch()
	{
		System.out.println("Browser launch");
	}
	@Test
	public void url_search()
	{
		System.out.println("Search the URL");
	}
	@Test
	public void register()
	{
		System.out.println("Register first");
	}
	@Test
	public void login()
	{
		System.out.println("Login with credential");
	}

}
