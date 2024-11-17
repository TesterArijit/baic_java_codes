package ab45_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class A71_TestClass_for_RetryAnalyzer {
	WebDriver driver;
	
	@Test(retryAnalyzer = selinium.TestNG.RetryAnalyzer_Practice.class)
	public void testcase1() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Mobile"+Keys.ENTER);
		Thread.sleep(2000);
		driver.quit();
	}

}
