package ab45_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A25_Flipkart_Autosuggestion_PrintAll {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Flipkart--->>
		driver.get("https://www.flipkart.com/");
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("mobiles");
		Thread.sleep(1000);	
		List<WebElement> results = driver.findElements(By.xpath("//form[@class='_2rslOn header-form-search OpXDaO']/ul/li"));
		
		int count = results.size();
		System.out.println(count);
		
		
		for(int i=0;i<count;i++) 
		{
			WebElement ele = results.get(i);
			String text = ele.getText();
			System.out.println(text);
			
		}
		
		driver.quit();

	}

}
