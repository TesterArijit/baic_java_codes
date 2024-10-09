package selinium.TestNG;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallel_Testing {
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void Autosuggestion(String nameofbrowser) throws InterruptedException
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
		driver.get("https://www.google.com/");
		//driver.manage().window().maximize(); // to maximize the window
		Thread.sleep(2000);
	WebElement	e=driver.findElement(By.name("q"));
	            e.sendKeys("bangalore");
	        Thread.sleep(2000);
	 List<WebElement>  e2= driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
	       int count =e2.size();
	       System.out.println(count);
	      e2.get(count-6).click();
	      Thread.sleep(2000);
	      driver.quit();
	}

}
