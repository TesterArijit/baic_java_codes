package ab45_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class A61_Pass_two_parameters_in_Test {
	

	@Test(priority=0, enabled=true)
	public void Launch_google() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.quit();
	}
	@Test(priority=-2, invocationCount=2)
	public void Launch_Amazon() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.quit();
		
	}
	@Test(priority=-3, invocationCount=1)
	public void Launch_Flipkart() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.quit();

    }
}
