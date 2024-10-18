package ab45_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class A48_1BM_1T_AM {
	
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
	public void Login() throws InterruptedException
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
	@AfterMethod
	public void Logout() throws InterruptedException
	{
		WebElement e = driver.findElement(By.xpath("//a[contains(text(), 'Log out')]"));
		e.click();
        Thread.sleep(2000);
        driver.quit();
	}

}
