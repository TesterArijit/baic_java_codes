package selinium.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert2 {
	WebDriver driver;
	@Test
	public void SearchBox() throws InterruptedException
	{
		 driver =new ChromeDriver();
		 driver.get("https://www.amazon.in/");
		 driver.manage().window().maximize(); // to maximize the window
		Thread.sleep(2000);
		WebElement e =driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		Assert.assertTrue(e.isEnabled()==true); //Here true is expected behaviour it should be handwriten
		//isEnabled is acual behaviour, comes from a method.
		driver.quit();
	}
	//Varoius Methods--->>
	//Assert.assertTrue(true)---->TC pass (expecting true, getting true)
	//Assert.assertTrue(false)---->TC fail (expecting true, getting false)
	//Assert.assertFalse(true)---->TC fail (expecting false, getting true)
	//Assert.assertFalse(false)---->TC pass (expecting false, getting false)
	//==================
	//Assert.assertTrue(true,"mesage")---->TC pass (expecting true, getting true)
		//Assert.assertTrue(false,"mesage")---->TC fail (expecting true, getting false)
		//Assert.assertFalse(true,"mesage")---->TC fail (expecting false, getting true)
		//Assert.assertFalse(false,"mesage")---->TC pass (expecting false, getting false)
}
