package ab45_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class A50_3T_1BM_1AM {
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
	public void Testcase1() throws InterruptedException
	{
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='gender-male']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("FirstName")).sendKeys("Arijit");
		Thread.sleep(2000);
		driver.findElement(By.id("LastName")).sendKeys("Chatterjee");
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("chatterjeearijit1991@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("ABCDabc123@!");
		Thread.sleep(2000);
		driver.findElement(By.id("ConfirmPassword")).sendKeys("ABCDabc123@!");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='register-button']")).click();
		Thread.sleep(2000);
	}
	@Test
	public void Testcase2() throws InterruptedException
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
	}
	@Test
	public void Testcase3() throws InterruptedException
	{
		WebElement search = driver.findElement(By.name("q"));
		search.click();
		search.sendKeys("shoe");
		Thread.sleep(2000);
		search.sendKeys(Keys.ENTER);
	}
	@AfterMethod
	public void Quit_Browser()
	{
		driver.quit();
	}
	

}
