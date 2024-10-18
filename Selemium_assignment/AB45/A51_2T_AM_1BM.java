package ab45_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class A51_2T_AM_1BM {
	
	WebDriver driver;
	@BeforeMethod
	public void Launch() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	@Test
	public void testcase1() throws InterruptedException
	{
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[autofocus='autofocus']")).sendKeys("chatterjeearijit1991@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[class='password']")).sendKeys("ABCDabc123@!");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='RememberMe']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[class='button-1 login-button']")).click();
		Thread.sleep(2000);
		WebElement e = driver.findElement(By.xpath("//a[contains(text(), 'Log out')]"));
		Thread.sleep(2000);
         e.click();
         Thread.sleep(2000);
         driver.quit();
	}
	@Test
	public void testcase2() throws InterruptedException
	{
		WebElement search = driver.findElement(By.name("q"));
		search.click();
		search.sendKeys("shoe");
		Thread.sleep(2000);
		search.sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		driver.quit();
	}

}
