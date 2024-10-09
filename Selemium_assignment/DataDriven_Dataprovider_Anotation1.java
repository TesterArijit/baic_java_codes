package selinium.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven_Dataprovider_Anotation1 {
	
	@Test(dataProvider ="inputs")
	public void Method1(String input) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.name("q"));
		e.sendKeys(input,Keys.ENTER);
		Thread.sleep(3000);
		driver.quit();
		
	}
	@DataProvider(name = "inputs")
	public Object [][] data1()
	{
		return new Object[][] {{"How to become teacher"},{"How to wake up at 4 am"}};
	}
	

}
