package selinium.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//Evey @Test have oits own @BeforeMethod and @AfterMethod
public class Two_Test_1BM_1AM {
WebDriver driver;
	
@Test(priority=1)
public void Navigation1() throws InterruptedException
{
	driver.manage().window().maximize();
	driver.navigate().to("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.navigate().to("https://www.google.co.in/");
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().refresh();
}
@Test(priority=2)
public void RightClick() throws InterruptedException
{
	driver.get("https://www.google.co.in/");
	Thread.sleep(2000);
	WebElement e = driver.findElement(By.xpath("//a[.='Images']"));
	
	Actions a=new Actions(driver);
	a.contextClick(e).perform();
	Thread.sleep(2000);
}
@BeforeMethod
public void Launch_Browser() throws InterruptedException
{
 driver=new ChromeDriver();
 Thread.sleep(2000);
}
@AfterMethod
public void Quit() throws InterruptedException
{
	Thread.sleep(2000);
	driver.quit();
}

}


