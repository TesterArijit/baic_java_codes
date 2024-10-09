package ab45_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A22_Flipkart_Autosuggestion {

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
		Thread.sleep(1000);
		results.get(count-1).click();
		Thread.sleep(4000);
		driver.quit();

	}

}
