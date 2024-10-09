package selinium.TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert1 {
   WebDriver driver;
	@Test
	public void Amazon_Search() throws InterruptedException
	{
		 
	 driver =new ChromeDriver();
	 driver.get("https://www.amazon.in/");
	 driver.manage().window().maximize(); // to maximize the window
	Thread.sleep(2000);
	WebElement e =driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	e.sendKeys("shoe",Keys.ENTER);
    Thread.sleep(2000);
    
    //Assert.assertTrue(false);// expected [true] but found [false]
    //Assert.assertTrue(true);
    
    List<WebElement> e1 = driver.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']"));
   int count= e1.size();
   System.out.println(count);
    Assert.assertTrue(e1.size()>10);
    driver.quit();
	}

}
