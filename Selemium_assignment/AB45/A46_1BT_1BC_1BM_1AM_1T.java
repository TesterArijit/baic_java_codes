package ab45_TestNG;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A46_1BT_1BC_1BM_1AM_1T {
	
	WebDriver driver;
	@BeforeTest
	public void Launch_Empty_Browser()
	{
		driver=new ChromeDriver();
	}
	@BeforeClass
	public void Launch_url() throws InterruptedException
	{
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	@BeforeMethod
	public void Tittle() throws InterruptedException
	{
		String tittle = driver.getTitle();
		Thread.sleep(2000);
		System.out.println(tittle);
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
		Thread.sleep(2000);
         e.click();
	    Thread.sleep(2000);
	    driver.quit();
	}
	

}
