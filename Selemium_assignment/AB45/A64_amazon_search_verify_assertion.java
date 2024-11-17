package ab45_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class A64_amazon_search_verify_assertion {
	WebDriver driver;
	
	@Test
	public void aamazon_search_validation()
	{
		 driver=new ChromeDriver();
		 driver.get("https://www.amazon.in/");
         driver.manage().window().maximize(); // to maximize the window
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
         WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
         //using Assertion concept
         
         Assert.assertEquals(searchbox.isDisplayed() && searchbox.isEnabled(), true,"Search box invalid");
         
         searchbox.sendKeys("shoes",Keys.ENTER);
 		 driver.quit();
         
	}

}
