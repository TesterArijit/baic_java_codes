package selinium.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Anotation_Pass_Five_Data {
	
	@Test(dataProvider ="inputs")
	public void Method1(String data) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.name("q"));
		e.sendKeys(data,Keys.ENTER);
		Thread.sleep(3000);
		driver.quit();
	}
	@DataProvider(name = "inputs")
	public Object[][] testcase()
	{
		return new Object[][] {{"Durga puja"},{"Kali puja"},{"Ganesh puja"},{"Moring walk benifis"},{"java"}};
	}
	

}
