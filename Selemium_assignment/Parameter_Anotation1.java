package selinium.TestNG;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_Anotation1 {
	WebDriver driver;
	@Test
	@Parameters("browser")
	
	public void testcase1(String nameofbrowser) throws InterruptedException
	{
		if(nameofbrowser.equals("chrome")) 
		{
			driver =new ChromeDriver();
		}
		if(nameofbrowser.equals("firefox")) 
		{
			driver =new FirefoxDriver();
		}
		if(nameofbrowser.equals("edge")) 
		{
			driver =new EdgeDriver();
		}
		
		
		//driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize(); // to maximize the window
		Thread.sleep(2000);
	WebElement e =driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	           e.sendKeys("shoe",Keys.ENTER);
	           Thread.sleep(2000);
	WebElement e2 = driver.findElement(By.xpath("//img[@alt='Campus Mens Terminator (N) Running Shoes']"));
	e2.click();
	 Thread.sleep(2000);
	Set<String> windowHandles = driver.getWindowHandles();
	System.out.println(windowHandles);
	Thread.sleep(4000);
	driver.quit();
	
	}

}
