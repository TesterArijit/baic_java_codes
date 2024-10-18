package ab45_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class A45_1T_1BM_1AM {
	WebDriver driver;
	@BeforeMethod
	
	public void Launch_Browser() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
				
	}
	@Test
	public void Login_and_HoverOver() throws InterruptedException
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
		WebElement e = driver.findElement(By.xpath("(//div[@class='master-wrapper-content']/div[@class='header-menu']/ul/li)[3]"));
		
		Actions a=new Actions(driver);
		a.moveToElement(e).perform();
		Thread.sleep(3000);
		
		WebElement e1 = driver.findElement(By.xpath("(//div[@class='master-wrapper-content']/div[@class='header-menu']/ul/li)[4]"));
		e1.click();
		Thread.sleep(4000);
		
	}
	@AfterClass
	public void Logout() throws InterruptedException
	{
		WebElement e = driver.findElement(By.xpath("//a[contains(text(), 'Log out')]"));
		Thread.sleep(2000);
         e.click();
	    Thread.sleep(2000);
	    driver.quit();
	}

}
