package selinium.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TimeOut {

	//This TC required 12.21sec time for execution
	//Intentialally we provide 10sec time for execution, timeOut is camelcase
	//Will get ThreadTimeOutException, which is a TestNG exception.
	
	@Test(timeOut=10000)
	public void HoverOver_FirstCry() throws InterruptedException
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.firstcry.com/");
		Thread.sleep(2000);
		WebElement e = driver.findElement(By.xpath("//a[.=' Toys']"));
				
			Actions a=new Actions(driver);
			a.moveToElement(e).perform();
			Thread.sleep(2000);
			driver.quit();
		

	}

}
