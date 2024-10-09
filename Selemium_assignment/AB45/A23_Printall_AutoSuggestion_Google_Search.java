package ab45_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A23_Printall_AutoSuggestion_Google_Search {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		WebElement search = driver.findElement(By.name("q"));
		Thread.sleep(1000);
		search.sendKeys("bangalore");
		Thread.sleep(2000);
		List<WebElement> result = driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		int count = result.size();
		System.out.println(count);
		Thread.sleep(1000);	
		for(WebElement ele:result)
		{
			String text = ele.getText();
			System.out.println(text);
			Thread.sleep(1000);
		}
		driver.quit();

	}

}
