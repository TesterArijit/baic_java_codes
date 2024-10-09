package selinium.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert3 {
	WebDriver driver;
	@Test
	public void Test1()
	{
		Assert.assertEquals(10, 10);//byte,byte
		// assertEquals applicable for all primitive data types.
	}
	@Test
	public void Test2()
	{
		Assert.assertEquals(true, false,"Sorry! Not possible");	
	}
	@Test
	public void Display() throws InterruptedException
	{
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		WebElement e = driver.findElement(By.xpath("//input[@class='button-1 search-box-button']"));
		Assert.assertTrue(e.isEnabled()==false, "it is enabled");
	}
	

}
