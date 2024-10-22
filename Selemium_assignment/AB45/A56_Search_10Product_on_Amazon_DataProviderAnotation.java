package ab45_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class A56_Search_10Product_on_Amazon_DataProviderAnotation {
	
	@Test(dataProvider = "input1")
	public void Amazon(String data) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.id("twotabsearchtextbox"));
		e.sendKeys(data,Keys.ENTER);
		Thread.sleep(3000);
		driver.quit();
	}
	
	@DataProvider(name = "input1")
	public Object[][] Testcase()
	{
		return new Object[][] {{"shirt"},{"mobile"},{"clock"},{"bag"},{"book"},{"soap"},{"oil"},{"face wash"},{"rice"},{"watercolor"}};
	}


}
