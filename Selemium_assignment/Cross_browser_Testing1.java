package selinium.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Cross_browser_Testing1 {
	
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void Register(String nameofbrowser) throws InterruptedException
	{
		if(nameofbrowser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		if(nameofbrowser.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		if(nameofbrowser.equals("edge"))
		{
			driver=new EdgeDriver();
		}
	
		//driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
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
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[autofocus='autofocus']")).sendKeys("chatterjeearijit1991@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[class='password']")).sendKeys("ABCDabc123@!");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='RememberMe']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[class='button-1 login-button']")).click();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("a[class='ico-logout']")).click();
		Thread.sleep(2000);
		driver.quit();
	}
	

}
